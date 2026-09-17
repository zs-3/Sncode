package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzbw extends android.content.ContextWrapper {
    private android.app.Activity zza;

    public zzbw(android.app.Application r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            android.app.Activity r0 = r1.zza
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
        L9:
            java.lang.Object r2 = super.getSystemService(r2)
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent r2) {
            r1 = this;
            android.app.Activity r0 = r1.zza
            if (r0 == 0) goto L8
            r0.startActivity(r2)
            return
        L8:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            super.startActivity(r2)
            return
    }

    public final void zza(android.app.Activity r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}
