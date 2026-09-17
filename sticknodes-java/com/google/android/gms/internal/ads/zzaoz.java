package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaoz implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzaec zzb;

    public zzaoz() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 4
            r0.<init>(r1)
            r3.zza = r0
            com.google.android.gms.internal.ads.zzaec r0 = new com.google.android.gms.internal.ads.zzaec
            r1 = -1
            java.lang.String r2 = "image/webp"
            r0.<init>(r1, r1, r2)
            r3.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r2, com.google.android.gms.internal.ads.zzadx r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzaec r0 = r1.zzb
            int r2 = r0.zzb(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ com.google.android.gms.internal.ads.zzadb zzc() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaec r0 = r1.zzb
            r0.zze(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r2, long r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaec r0 = r1.zzb
            r0.zzf(r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r8) throws java.io.IOException {
            r7 = this;
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            r1 = 4
            r0.zzI(r1)
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzacq r8 = (com.google.android.gms.internal.ads.zzacq) r8
            r2 = 0
            r8.zzm(r0, r2, r1, r2)
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            long r3 = r0.zzu()
            r5 = 1380533830(0x52494646, double:6.820743383E-315)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L3f
            r8.zzl(r1, r2)
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            r0.zzI(r1)
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            byte[] r0 = r0.zzN()
            r8.zzm(r0, r2, r1, r2)
            com.google.android.gms.internal.ads.zzek r8 = r7.zza
            long r0 = r8.zzu()
            r3 = 1464156752(0x57454250, double:7.233895513E-315)
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 != 0) goto L3f
            r8 = 1
            return r8
        L3f:
            return r2
    }
}
