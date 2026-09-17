package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzafs extends com.google.android.gms.internal.ads.zzadn {
    private final long zza;

    public zzafs(com.google.android.gms.internal.ads.zzadc r3, long r4) {
            r2 = this;
            r2.<init>(r3)
            long r0 = r3.zzf()
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.gms.internal.ads.zzdi.zzd(r3)
            r2.zza = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadn, com.google.android.gms.internal.ads.zzadc
    public final long zzd() {
            r4 = this;
            long r0 = super.zzd()
            long r2 = r4.zza
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadn, com.google.android.gms.internal.ads.zzadc
    public final long zze() {
            r4 = this;
            long r0 = super.zze()
            long r2 = r4.zza
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadn, com.google.android.gms.internal.ads.zzadc
    public final long zzf() {
            r4 = this;
            long r0 = super.zzf()
            long r2 = r4.zza
            long r0 = r0 - r2
            return r0
    }
}
