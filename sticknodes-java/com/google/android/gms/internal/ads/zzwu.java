package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzwu implements com.google.android.gms.internal.ads.zzwn {
    private final com.google.android.gms.internal.ads.zzwn zza;
    private final long zzb;

    public zzwu(com.google.android.gms.internal.ads.zzwn r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zza(com.google.android.gms.internal.ads.zzkm r5, com.google.android.gms.internal.ads.zzhq r6, int r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r4.zza
            int r5 = r0.zza(r5, r6, r7)
            r7 = -4
            if (r5 != r7) goto L11
            long r0 = r6.zze
            long r2 = r4.zzb
            long r0 = r0 + r2
            r6.zze = r0
            return r7
        L11:
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zzb(long r4) {
            r3 = this;
            long r0 = r3.zzb
            com.google.android.gms.internal.ads.zzwn r2 = r3.zza
            long r4 = r4 - r0
            int r4 = r2.zzb(r4)
            return r4
    }

    public final com.google.android.gms.internal.ads.zzwn zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zzd() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r1.zza
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final boolean zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r1.zza
            boolean r0 = r0.zze()
            return r0
    }
}
