/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.vault.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;
import org.springframework.vault.support.SslConfiguration;
import org.springframework.vault.util.Settings;

/**
 * Test configuration for Vault integration tests.
 * 
 * @author Mark Paluch
 */
@Configuration
class VaultIntegrationTestConfiguration extends AbstractVaultConfiguration {

	@Override
	public VaultEndpoint vaultEndpoint() {
		return new VaultEndpoint();
	}

	@Override
	public ClientAuthentication clientAuthentication() {
		return new TokenAuthentication(Settings.token());
	}

	@Override
	public SslConfiguration sslConfiguration() {
		return Settings.createSslConfiguration();
	}
}
