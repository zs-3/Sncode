package com.google.firebase.sessions.settings;

/* compiled from: RemoteSettingsFetcher.kt */
/* loaded from: classes2.dex */
public final class RemoteSettingsFetcher implements com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher {
    public static final com.google.firebase.sessions.settings.RemoteSettingsFetcher.Companion Companion = null;
    private final com.google.firebase.sessions.ApplicationInfo appInfo;
    private final java.lang.String baseUrl;
    private final kotlin.coroutines.CoroutineContext blockingDispatcher;

    /* compiled from: RemoteSettingsFetcher.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: RemoteSettingsFetcher.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> $headerOptions;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $onFailure;
        final /* synthetic */ kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $onSuccess;
        int label;
        final /* synthetic */ com.google.firebase.sessions.settings.RemoteSettingsFetcher this$0;

        AnonymousClass2(com.google.firebase.sessions.settings.RemoteSettingsFetcher r1, java.util.Map<java.lang.String, java.lang.String> r2, kotlin.jvm.functions.Function2<? super org.json.JSONObject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.RemoteSettingsFetcher.AnonymousClass2> r5) {
                r0 = this;
                r0.this$0 = r1
                r0.$headerOptions = r2
                r0.$onSuccess = r3
                r0.$onFailure = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                r6 = this;
                com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2 r7 = new com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2
                com.google.firebase.sessions.settings.RemoteSettingsFetcher r1 = r6.this$0
                java.util.Map<java.lang.String, java.lang.String> r2 = r6.$headerOptions
                kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r6.$onSuccess
                kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r6.$onFailure
                r0 = r7
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2 r1 = (com.google.firebase.sessions.settings.RemoteSettingsFetcher.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.throwOnFailure(r8)
                goto Le3
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L23
                goto Le3
            L23:
                r8 = move-exception
                goto Lce
            L26:
                kotlin.ResultKt.throwOnFailure(r8)
                com.google.firebase.sessions.settings.RemoteSettingsFetcher r8 = r7.this$0     // Catch: java.lang.Exception -> L23
                java.net.URL r8 = com.google.firebase.sessions.settings.RemoteSettingsFetcher.access$settingsUrl(r8)     // Catch: java.lang.Exception -> L23
                java.net.URLConnection r8 = r8.openConnection()     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r1)     // Catch: java.lang.Exception -> L23
                javax.net.ssl.HttpsURLConnection r8 = (javax.net.ssl.HttpsURLConnection) r8     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "GET"
                r8.setRequestMethod(r1)     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "Accept"
                java.lang.String r5 = "application/json"
                r8.setRequestProperty(r1, r5)     // Catch: java.lang.Exception -> L23
                java.util.Map<java.lang.String, java.lang.String> r1 = r7.$headerOptions     // Catch: java.lang.Exception -> L23
                java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L23
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L23
            L50:
                boolean r5 = r1.hasNext()     // Catch: java.lang.Exception -> L23
                if (r5 == 0) goto L6c
                java.lang.Object r5 = r1.next()     // Catch: java.lang.Exception -> L23
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> L23
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> L23
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L23
                java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L23
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L23
                r8.setRequestProperty(r6, r5)     // Catch: java.lang.Exception -> L23
                goto L50
            L6c:
                int r1 = r8.getResponseCode()     // Catch: java.lang.Exception -> L23
                r5 = 200(0xc8, float:2.8E-43)
                if (r1 != r5) goto Lb2
                java.io.InputStream r8 = r8.getInputStream()     // Catch: java.lang.Exception -> L23
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L23
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L23
                r3.<init>(r8)     // Catch: java.lang.Exception -> L23
                r1.<init>(r3)     // Catch: java.lang.Exception -> L23
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
                r3.<init>()     // Catch: java.lang.Exception -> L23
                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L23
                r5.<init>()     // Catch: java.lang.Exception -> L23
            L8c:
                java.lang.String r6 = r1.readLine()     // Catch: java.lang.Exception -> L23
                r5.element = r6     // Catch: java.lang.Exception -> L23
                if (r6 == 0) goto L98
                r3.append(r6)     // Catch: java.lang.Exception -> L23
                goto L8c
            L98:
                r1.close()     // Catch: java.lang.Exception -> L23
                r8.close()     // Catch: java.lang.Exception -> L23
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L23
                r8.<init>(r1)     // Catch: java.lang.Exception -> L23
                kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.$onSuccess     // Catch: java.lang.Exception -> L23
                r7.label = r4     // Catch: java.lang.Exception -> L23
                java.lang.Object r8 = r1.invoke(r8, r7)     // Catch: java.lang.Exception -> L23
                if (r8 != r0) goto Le3
                return r0
            Lb2:
                kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r8 = r7.$onFailure     // Catch: java.lang.Exception -> L23
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
                r4.<init>()     // Catch: java.lang.Exception -> L23
                java.lang.String r5 = "Bad response code: "
                r4.append(r5)     // Catch: java.lang.Exception -> L23
                r4.append(r1)     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L23
                r7.label = r3     // Catch: java.lang.Exception -> L23
                java.lang.Object r8 = r8.invoke(r1, r7)     // Catch: java.lang.Exception -> L23
                if (r8 != r0) goto Le3
                return r0
            Lce:
                kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.$onFailure
                java.lang.String r3 = r8.getMessage()
                if (r3 != 0) goto Lda
                java.lang.String r3 = r8.toString()
            Lda:
                r7.label = r2
                java.lang.Object r8 = r1.invoke(r3, r7)
                if (r8 != r0) goto Le3
                return r0
            Le3:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    static {
            com.google.firebase.sessions.settings.RemoteSettingsFetcher$Companion r0 = new com.google.firebase.sessions.settings.RemoteSettingsFetcher$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.settings.RemoteSettingsFetcher.Companion = r0
            return
    }

    public RemoteSettingsFetcher(com.google.firebase.sessions.ApplicationInfo r2, kotlin.coroutines.CoroutineContext r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "appInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "baseUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.appInfo = r2
            r1.blockingDispatcher = r3
            r1.baseUrl = r4
            return
    }

    public /* synthetic */ RemoteSettingsFetcher(com.google.firebase.sessions.ApplicationInfo r1, kotlin.coroutines.CoroutineContext r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            java.lang.String r3 = "firebase-settings.crashlytics.com"
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.net.URL access$settingsUrl(com.google.firebase.sessions.settings.RemoteSettingsFetcher r0) {
            java.net.URL r0 = r0.settingsUrl()
            return r0
    }

    private final java.net.URL settingsUrl() {
            r3 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "https"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = r3.baseUrl
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = "spi"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "v2"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "platforms"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "android"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "gmp"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            com.google.firebase.sessions.ApplicationInfo r1 = r3.appInfo
            java.lang.String r1 = r1.getAppId()
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "settings"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            com.google.firebase.sessions.ApplicationInfo r1 = r3.appInfo
            com.google.firebase.sessions.AndroidApplicationInfo r1 = r1.getAndroidAppInfo()
            java.lang.String r1 = r1.getAppBuildVersion()
            java.lang.String r2 = "build_version"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r1)
            com.google.firebase.sessions.ApplicationInfo r1 = r3.appInfo
            com.google.firebase.sessions.AndroidApplicationInfo r1 = r1.getAndroidAppInfo()
            java.lang.String r1 = r1.getVersionName()
            java.lang.String r2 = "display_version"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r1)
            java.net.URL r1 = new java.net.URL
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public java.lang.Object doConfigFetch(java.util.Map<java.lang.String, java.lang.String> r9, kotlin.jvm.functions.Function2<? super org.json.JSONObject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            r8 = this;
            kotlin.coroutines.CoroutineContext r0 = r8.blockingDispatcher
            com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2 r7 = new com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r0, r7, r12)
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r10) goto L18
            return r9
        L18:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }
}
