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

package cc.tencent.matrix.plugin;

import cc.tencent.matrix.report.Issue;

/**
 * Created by zhangshaowen on 17/5/17.
 */

public interface PluginListener {
    void onInit(Plugin plugin);

    void onStart(Plugin plugin);

    void onStop(Plugin plugin);

    void onDestroy(Plugin plugin);

    void onReportIssue(Issue issue);
}
