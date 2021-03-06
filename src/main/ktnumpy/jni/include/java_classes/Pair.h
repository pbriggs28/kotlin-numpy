/*
 * Copyright 2019 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef _PAIR_H_
#define _PAIR_H_

jobject kotlin_Pair_new (JNIEnv *, jobject, jobject);
jobject kotlin_Pair_getFirst (JNIEnv *, jobject);
jobject kotlin_Pair_getSecond (JNIEnv *, jobject);

#endif //_PAIR_H_
