/*
 * generated by Xtext 2.28.0
 */
package org.uppaal;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.uppaal.AbstractUppaalXMLRuntimeModule;
import org.uppaal.conversion.UppaalValueConverter;
import org.uppaal.scoping.UppaalQualifiedNameProvider;
import org.uppaal.serializer.UppaalTransientValueService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class UppaalXMLRuntimeModule extends AbstractUppaalXMLRuntimeModule {
	/*
	 * Note: the types of the return values have to be a class type
	 * of form {@code Class<? extends Service>} where {@code Service}
	 * represents the service the implementation is mapped to.
	 * This is due to the fact that reflections are used to get the return type
	 * of the method and use the upper bound of its wildcard type parameter
	 * as a key of the dependency injection mapping.
	 */
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return UppaalQualifiedNameProvider.class;
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return UppaalValueConverter.class;
	}
	
	@Override
	public Class<? extends ITransientValueService> bindITransientValueService() {
		return UppaalTransientValueService.class;
	}
}
