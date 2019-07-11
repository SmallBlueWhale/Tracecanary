/*
 * Tencent is pleased to support the open source community by making wechat-matrix available.
 * Copyright (C) 2018 THL A29 Limited, a Tencent company. All rights reserved.
 * Licensed under the BSD 3-Clause License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cc.popin.aladdin.plugin.extension;


/**
 * Created by jinqiuchen on 17/12/26.
 */

class MatrixDelUnusedResConfiguration {

    boolean enable
    String variant
    boolean needSign
    boolean shrinkArsc
    String apksignerPath
    Set<String> unusedResources
    Set<String> ignoreResources

    MatrixDelUnusedResConfiguration() {
        enable = false
        variant = ""
        needSign = false
        shrinkArsc = false
        apksignerPath = ""
        unusedResources = new HashSet<>()
        ignoreResources = new HashSet<>()
    }

    @Override
    String toString() {
        """| enable = ${enable}
           | variant = ${variant}
           | needSign = ${needSign}
           | shrinkArsc = ${shrinkArsc}
           | apkSignerPath = ${apksignerPath}
           | unusedResources = ${unusedResources}
           | ignoreResources = ${ignoreResources}
        """.stripMargin()
    }
}
