package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class RevocationBoundService extends android.app.Service {
    public RevocationBoundService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r4) {
            r3 = this;
            java.lang.String r0 = r4.getAction()
            java.lang.String r1 = "com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "RevocationService"
            if (r0 != 0) goto L2e
            java.lang.String r0 = r4.getAction()
            java.lang.String r2 = "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1b
            goto L2e
        L1b:
            java.lang.String r4 = r4.getAction()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Unknown action sent to RevocationBoundService: "
            java.lang.String r4 = r0.concat(r4)
            android.util.Log.w(r1, r4)
            r4 = 0
            return r4
        L2e:
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L46
            java.lang.String r4 = r4.getAction()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "RevocationBoundService handling "
            java.lang.String r4 = r0.concat(r4)
            android.util.Log.v(r1, r4)
        L46:
            com.google.android.gms.auth.api.signin.internal.zbt r4 = new com.google.android.gms.auth.api.signin.internal.zbt
            r4.<init>(r3)
            return r4
    }
}
