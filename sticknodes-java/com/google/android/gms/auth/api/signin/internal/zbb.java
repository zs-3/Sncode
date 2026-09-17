package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbb implements java.lang.Runnable {
    private static final com.google.android.gms.common.logging.Logger zba = null;
    private final java.lang.String zbb;
    private final com.google.android.gms.common.api.internal.StatusPendingResult zbc;

    static {
            com.google.android.gms.common.logging.Logger r0 = new com.google.android.gms.common.logging.Logger
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "RevokeAccessOperation"
            r0.<init>(r2, r1)
            com.google.android.gms.auth.api.signin.internal.zbb.zba = r0
            return
    }

    public zbb(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r2 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r1.zbb = r2
            com.google.android.gms.common.api.internal.StatusPendingResult r2 = new com.google.android.gms.common.api.internal.StatusPendingResult
            r0 = 0
            r2.<init>(r0)
            r1.zbc = r2
            return
    }

    public static com.google.android.gms.common.api.PendingResult zba(java.lang.String r1) {
            if (r1 != 0) goto Le
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r0 = 4
            r1.<init>(r0)
            r0 = 0
            com.google.android.gms.common.api.PendingResult r1 = com.google.android.gms.common.api.PendingResults.immediateFailedResult(r1, r0)
            return r1
        Le:
            com.google.android.gms.auth.api.signin.internal.zbb r0 = new com.google.android.gms.auth.api.signin.internal.zbb
            r0.<init>(r1)
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r0)
            r1.start()
            com.google.android.gms.common.api.internal.StatusPendingResult r1 = r0.zbc
            return r1
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.String r3 = r6.zbb     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r4.<init>()     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.String r5 = "https://accounts.google.com/o/oauth2/revoke?token="
            r4.append(r5)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r4.append(r3)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r2.<init>(r3)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r2.setRequestProperty(r3, r4)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            int r2 = r2.getResponseCode()     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L33
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            goto L3c
        L33:
            com.google.android.gms.common.logging.Logger r3 = com.google.android.gms.auth.api.signin.internal.zbb.zba     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.String r4 = "Unable to revoke access!"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r3.e(r4, r5)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
        L3c:
            com.google.android.gms.common.logging.Logger r3 = com.google.android.gms.auth.api.signin.internal.zbb.zba     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r4.<init>()     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.String r5 = "Response Code: "
            r4.append(r5)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r4.append(r2)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            r3.d(r2, r4)     // Catch: java.lang.Exception -> L55 java.io.IOException -> L57
            goto L84
        L55:
            r2 = move-exception
            goto L59
        L57:
            r2 = move-exception
            goto L6f
        L59:
            com.google.android.gms.common.logging.Logger r3 = com.google.android.gms.auth.api.signin.internal.zbb.zba
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = "Exception when revoking access: "
            java.lang.String r2 = r4.concat(r2)
            r3.e(r2, r1)
            goto L84
        L6f:
            com.google.android.gms.common.logging.Logger r3 = com.google.android.gms.auth.api.signin.internal.zbb.zba
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = "IOException when revoking access: "
            java.lang.String r2 = r4.concat(r2)
            r3.e(r2, r1)
        L84:
            com.google.android.gms.common.api.internal.StatusPendingResult r1 = r6.zbc
            r1.setResult(r0)
            return
    }
}
