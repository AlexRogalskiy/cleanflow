/*
 * Copyright 2020-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this artifact or file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.naturalprogrammer.cleanflow;

import com.naturalprogrammer.cleanflow.services.NoPathToFollowService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NoPathToFollowTest {

    private final NoPathToFollowService service = new NoPathToFollowService();

    @Test
    void testNoPathToFollow() {

        IndexOutOfBoundsException ex = assertThrows(IndexOutOfBoundsException.class, service::execute);
        assertEquals("No path to follow after EXCLUSIVE_GATEWAY 'isFoo'", ex.getMessage());
    }
}
