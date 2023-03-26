/*
 * generated by Xtext 2.29.0
 */
package org.muml.uppaal.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.muml.uppaal.NTA
import org.junit.jupiter.api.Disabled

@ExtendWith(InjectionExtension)
@InjectWith(UppaalXMLInjectorProvider)
class UppaalXMLParsingTest {
	@Inject
	ParseHelper<NTA> parseHelper
	
	@Test
	@Disabled
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
