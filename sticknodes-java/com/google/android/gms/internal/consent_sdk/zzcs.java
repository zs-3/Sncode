package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzcs {
    private static java.lang.Boolean zza;

    private zzcs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(android.webkit.WebView r3, java.lang.String r4) {
            java.lang.Class<com.google.android.gms.internal.consent_sdk.zzcs> r0 = com.google.android.gms.internal.consent_sdk.zzcs.class
            monitor-enter(r0)
            java.lang.Boolean r1 = com.google.android.gms.internal.consent_sdk.zzcs.zza     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            if (r1 != 0) goto L16
            java.lang.String r1 = "(function(){})()"
            r3.evaluateJavascript(r1, r2)     // Catch: java.lang.IllegalStateException -> L12 java.lang.Throwable -> L2d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.IllegalStateException -> L12 java.lang.Throwable -> L2d
            com.google.android.gms.internal.consent_sdk.zzcs.zza = r1     // Catch: java.lang.IllegalStateException -> L12 java.lang.Throwable -> L2d
            goto L16
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.consent_sdk.zzcs.zza = r1     // Catch: java.lang.Throwable -> L2d
        L16:
            java.lang.Boolean r1 = com.google.android.gms.internal.consent_sdk.zzcs.zza     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L23
            r3.evaluateJavascript(r4, r2)
            return
        L23:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = r0.concat(r4)
            r3.loadUrl(r4)
            return
        L2d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r3
    }
}
