package com.tiedros.abstractfactory.gcp;

import com.tiedros.abstractfactory.Instance;
import com.tiedros.abstractfactory.Instance.Capacity;
import com.tiedros.abstractfactory.ResourceFactory;
import com.tiedros.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
