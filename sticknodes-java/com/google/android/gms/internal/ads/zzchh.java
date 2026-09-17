package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzchh extends android.content.MutableContextWrapper {
    private android.app.Activity zza;
    private android.content.Context zzb;
    private android.content.Context zzc;

    public zzchh(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.setBaseContext(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.zzc
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(android.content.Context r3) {
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            r2.zzb = r0
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto Le
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2.zza = r1
            r2.zzc = r3
            super.setBaseContext(r0)
            return
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
            android.content.Context r0 = r1.zzb
            r0.startActivity(r2)
            return
    }

    public final android.app.Activity zza() {
            r1 = this;
            android.app.Activity r0 = r1.zza
            return r0
    }

    public final android.content.Context zzb() {
            r1 = this;
            android.content.Context r0 = r1.zzc
            return r0
    }
}
