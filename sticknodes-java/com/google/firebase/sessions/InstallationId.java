package com.google.firebase.sessions;

/* compiled from: InstallationId.kt */
/* loaded from: classes2.dex */
public final class InstallationId {
    public static final com.google.firebase.sessions.InstallationId.Companion Companion = null;
    private final java.lang.String authToken;
    private final java.lang.String fid;

    /* compiled from: InstallationId.kt */
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

        public final java.lang.Object create(com.google.firebase.installations.FirebaseInstallationsApi r9, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId> r10) {
                r8 = this;
                boolean r0 = r10 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r10
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L46
                if (r2 == r6) goto L3e
                if (r2 != r5) goto L36
                java.lang.Object r9 = r0.L$0
                java.lang.String r9 = (java.lang.String) r9
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L34
                goto L89
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.L$0
                com.google.firebase.installations.FirebaseInstallationsApi r9 = (com.google.firebase.installations.FirebaseInstallationsApi) r9
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L6d
                goto L5e
            L46:
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.getToken(r10)     // Catch: java.lang.Exception -> L6d
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L6d
                r0.L$0 = r9     // Catch: java.lang.Exception -> L6d
                r0.label = r6     // Catch: java.lang.Exception -> L6d
                java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.await(r10, r0)     // Catch: java.lang.Exception -> L6d
                if (r10 != r1) goto L5e
                return r1
            L5e:
                com.google.firebase.installations.InstallationTokenResult r10 = (com.google.firebase.installations.InstallationTokenResult) r10     // Catch: java.lang.Exception -> L6d
                java.lang.String r10 = r10.getToken()     // Catch: java.lang.Exception -> L6d
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L6d
                r7 = r10
                r10 = r9
                r9 = r7
                goto L75
            L6d:
                r10 = move-exception
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L75:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.L$0 = r9     // Catch: java.lang.Exception -> L34
                r0.label = r5     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.await(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L89
                return r1
            L89:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Exception -> L34
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                r3 = r10
                goto L97
            L92:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L97:
                com.google.firebase.sessions.InstallationId r10 = new com.google.firebase.sessions.InstallationId
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
        }
    }

    static {
            com.google.firebase.sessions.InstallationId$Companion r0 = new com.google.firebase.sessions.InstallationId$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.InstallationId.Companion = r0
            return
    }

    private InstallationId(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.fid = r1
            r0.authToken = r2
            return
    }

    public /* synthetic */ InstallationId(java.lang.String r1, java.lang.String r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public final java.lang.String getAuthToken() {
            r1 = this;
            java.lang.String r0 = r1.authToken
            return r0
    }

    public final java.lang.String getFid() {
            r1 = this;
            java.lang.String r0 = r1.fid
            return r0
    }
}
