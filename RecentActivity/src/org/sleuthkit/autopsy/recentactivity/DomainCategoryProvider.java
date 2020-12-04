/*
 * Autopsy Forensic Browser
 *
 * Copyright 2020 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.recentactivity;

import org.sleuthkit.autopsy.ingest.IngestModule;

/**
 * Interface providing the category of a domain for creating
 * TSK_WEB_CATEGORIZATION artifacts.
 */
public interface DomainCategoryProvider {
    public static class DomainCategoryResult {
        private final String hostSuffix;
        private final String category;
        private final boolean hasChildren;
        
        public DomainCategoryResult(String hostSuffix, String category, boolean hasChildren) {
            this.hostSuffix = hostSuffix;
            this.category = category;
            this.hasChildren = hasChildren;
        }

        public String getHostSuffix() {
            return hostSuffix;
        }

        public String getCategory() {
            return category;
        }
        
        public boolean hasChildren() {
            return hasChildren;
        }
    }

    /**
     * Provides the DomainCategory for a given domain/host or null if none can
     * be determined.
     *
     * @param domain The domain of the url.
     * @param host The host of the url.
     * @return The domain category if the domain/host combination was found or
     * null if not.
     */
    DomainCategoryResult getCategory(String domain, String host);
    
    void initialize() throws IngestModule.IngestModuleException;
}
