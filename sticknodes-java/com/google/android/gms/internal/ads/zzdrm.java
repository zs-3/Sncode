package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdrm implements com.google.android.gms.internal.ads.zzcyv {
    private final com.google.android.gms.internal.ads.zzcfo zza;

    zzdrm(com.google.android.gms.internal.ads.zzcfo r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdj(android.content.Context r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zza
            if (r1 == 0) goto L7
            r1.destroy()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdl(android.content.Context r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zza
            if (r1 == 0) goto L7
            r1.onPause()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdm(android.content.Context r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zza
            if (r1 == 0) goto L7
            r1.onResume()
        L7:
            return
    }
}
