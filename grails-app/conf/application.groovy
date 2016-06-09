// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.useSecurityEventListener = true
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.app.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.app.UserRole'
grails.plugin.springsecurity.authority.className = 'com.app.Role'
grails.plugin.springsecurity.password.algorithm='SHA-256'

grails.plugin.springsecurity.rest.login.active = true
grails.plugin.springsecurity.rest.login.failureStatusCode = 401
grails.plugin.springsecurity.rest.token.rendering.tokenPropertyName = 'access_token'

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/error', access: ['permitAll']],
		[pattern: '/index', access: ['permitAll']],
		[pattern: '/index.gsp', access: ['permitAll']],
		[pattern: '/shutdown', access: ['permitAll']],
		[pattern: '/assets/**', access: ['permitAll']],
		[pattern: '/**/js/**', access: ['permitAll']],
		[pattern: '/**/css/**', access: ['permitAll']],
		[pattern: '/**/images/**', access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],
		[pattern: '/author/**', access: ['IS_AUTHENTICATED_REMEMBERED']],
		[pattern: '/rest/**', access: ['permitAll']],
		[pattern: '/rest/public/**', access: ['permitAll']],
		[pattern: '/api/**', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
		//Public chain
		[
				pattern: '/rest/public/**',
				filters: 'anonymousAuthenticationFilter,restTokenValidationFilter,restExceptionTranslationFilter,filterInvocationInterceptor'
		],
		//Stateless chain
		[
				pattern: '/rest/**',
				filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
		],
		//Traditional chain
		[
				pattern: '/**',
				filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter'
		]
]