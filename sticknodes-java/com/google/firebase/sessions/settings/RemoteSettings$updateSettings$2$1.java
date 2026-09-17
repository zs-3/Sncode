package com.google.firebase.sessions.settings;

/* compiled from: RemoteSettings.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, 128, 131, 133, 134, 136}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RemoteSettings$updateSettings$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ com.google.firebase.sessions.settings.RemoteSettings this$0;

    RemoteSettings$updateSettings$2$1(com.google.firebase.sessions.settings.RemoteSettings r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 r0 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1
            com.google.firebase.sessions.settings.RemoteSettings r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(org.json.JSONObject r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(org.json.JSONObject r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 r1 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            r12 = this;
            java.lang.String r0 = "cache_duration"
            java.lang.String r1 = "session_timeout_seconds"
            java.lang.String r2 = "sampling_rate"
            java.lang.String r3 = "sessions_enabled"
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r12.label
            r6 = 0
            switch(r5) {
                case 0: goto L50;
                case 1: goto L3f;
                case 2: goto L32;
                case 3: goto L29;
                case 4: goto L24;
                case 5: goto L1f;
                case 6: goto L1a;
                default: goto L12;
            }
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L1a0
        L1f:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L182
        L24:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L15f
        L29:
            java.lang.Object r0 = r12.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L13c
        L32:
            java.lang.Object r0 = r12.L$1
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r1 = r12.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L119
        L3f:
            java.lang.Object r0 = r12.L$2
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r2 = r12.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lf1
        L50:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.L$0
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Fetched settings: "
            r5.append(r7)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "SessionConfigFetcher"
            android.util.Log.d(r7, r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            java.lang.String r10 = "app_quality"
            boolean r11 = r13.has(r10)
            if (r11 == 0) goto Ld2
            java.lang.Object r13 = r13.get(r10)
            java.lang.String r10 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r10)
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            boolean r10 = r13.has(r3)     // Catch: org.json.JSONException -> Lca
            if (r10 == 0) goto L9c
            java.lang.Object r3 = r13.get(r3)     // Catch: org.json.JSONException -> Lca
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: org.json.JSONException -> Lca
            goto L9d
        L9c:
            r3 = r6
        L9d:
            boolean r10 = r13.has(r2)     // Catch: org.json.JSONException -> Lc8
            if (r10 == 0) goto Lab
            java.lang.Object r2 = r13.get(r2)     // Catch: org.json.JSONException -> Lc8
            java.lang.Double r2 = (java.lang.Double) r2     // Catch: org.json.JSONException -> Lc8
            r5.element = r2     // Catch: org.json.JSONException -> Lc8
        Lab:
            boolean r2 = r13.has(r1)     // Catch: org.json.JSONException -> Lc8
            if (r2 == 0) goto Lb9
            java.lang.Object r1 = r13.get(r1)     // Catch: org.json.JSONException -> Lc8
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: org.json.JSONException -> Lc8
            r8.element = r1     // Catch: org.json.JSONException -> Lc8
        Lb9:
            boolean r1 = r13.has(r0)     // Catch: org.json.JSONException -> Lc8
            if (r1 == 0) goto Ld3
            java.lang.Object r13 = r13.get(r0)     // Catch: org.json.JSONException -> Lc8
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: org.json.JSONException -> Lc8
            r9.element = r13     // Catch: org.json.JSONException -> Lc8
            goto Ld3
        Lc8:
            r13 = move-exception
            goto Lcc
        Lca:
            r13 = move-exception
            r3 = r6
        Lcc:
            java.lang.String r0 = "Error parsing the configs remotely fetched: "
            android.util.Log.e(r7, r0, r13)
            goto Ld3
        Ld2:
            r3 = r6
        Ld3:
            if (r3 == 0) goto Lf4
            com.google.firebase.sessions.settings.RemoteSettings r13 = r12.this$0
            r3.booleanValue()
            com.google.firebase.sessions.settings.SettingsCache r13 = com.google.firebase.sessions.settings.RemoteSettings.access$getSettingsCache(r13)
            r12.L$0 = r5
            r12.L$1 = r8
            r12.L$2 = r9
            r0 = 1
            r12.label = r0
            java.lang.Object r13 = r13.updateSettingsEnabled(r3, r12)
            if (r13 != r4) goto Lee
            return r4
        Lee:
            r2 = r5
            r1 = r8
            r0 = r9
        Lf1:
            r8 = r1
            r1 = r2
            goto Lf6
        Lf4:
            r1 = r5
            r0 = r9
        Lf6:
            T r13 = r8.element
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L119
            com.google.firebase.sessions.settings.RemoteSettings r2 = r12.this$0
            r13.intValue()
            com.google.firebase.sessions.settings.SettingsCache r13 = com.google.firebase.sessions.settings.RemoteSettings.access$getSettingsCache(r2)
            T r2 = r8.element
            java.lang.Integer r2 = (java.lang.Integer) r2
            r12.L$0 = r1
            r12.L$1 = r0
            r12.L$2 = r6
            r3 = 2
            r12.label = r3
            java.lang.Object r13 = r13.updateSessionRestartTimeout(r2, r12)
            if (r13 != r4) goto L119
            return r4
        L119:
            T r13 = r1.element
            java.lang.Double r13 = (java.lang.Double) r13
            if (r13 == 0) goto L13c
            com.google.firebase.sessions.settings.RemoteSettings r2 = r12.this$0
            r13.doubleValue()
            com.google.firebase.sessions.settings.SettingsCache r13 = com.google.firebase.sessions.settings.RemoteSettings.access$getSettingsCache(r2)
            T r1 = r1.element
            java.lang.Double r1 = (java.lang.Double) r1
            r12.L$0 = r0
            r12.L$1 = r6
            r12.L$2 = r6
            r2 = 3
            r12.label = r2
            java.lang.Object r13 = r13.updateSamplingRate(r1, r12)
            if (r13 != r4) goto L13c
            return r4
        L13c:
            T r13 = r0.element
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L162
            com.google.firebase.sessions.settings.RemoteSettings r1 = r12.this$0
            r13.intValue()
            com.google.firebase.sessions.settings.SettingsCache r13 = com.google.firebase.sessions.settings.RemoteSettings.access$getSettingsCache(r1)
            T r0 = r0.element
            java.lang.Integer r0 = (java.lang.Integer) r0
            r12.L$0 = r6
            r12.L$1 = r6
            r12.L$2 = r6
            r1 = 4
            r12.label = r1
            java.lang.Object r13 = r13.updateSessionCacheDuration(r0, r12)
            if (r13 != r4) goto L15f
            return r4
        L15f:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            goto L163
        L162:
            r13 = r6
        L163:
            if (r13 != 0) goto L182
            com.google.firebase.sessions.settings.RemoteSettings r13 = r12.this$0
            com.google.firebase.sessions.settings.SettingsCache r13 = com.google.firebase.sessions.settings.RemoteSettings.access$getSettingsCache(r13)
            r0 = 86400(0x15180, float:1.21072E-40)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            r12.L$0 = r6
            r12.L$1 = r6
            r12.L$2 = r6
            r1 = 5
            r12.label = r1
            java.lang.Object r13 = r13.updateSessionCacheDuration(r0, r12)
            if (r13 != r4) goto L182
            return r4
        L182:
            com.google.firebase.sessions.settings.RemoteSettings r13 = r12.this$0
            com.google.firebase.sessions.settings.SettingsCache r13 = com.google.firebase.sessions.settings.RemoteSettings.access$getSettingsCache(r13)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            r12.L$0 = r6
            r12.L$1 = r6
            r12.L$2 = r6
            r1 = 6
            r12.label = r1
            java.lang.Object r13 = r13.updateSessionCacheUpdatedTime(r0, r12)
            if (r13 != r4) goto L1a0
            return r4
        L1a0:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
    }
}
