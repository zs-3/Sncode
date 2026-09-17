package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzafa implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzaec zzb;

    public zzafa() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 4
            r0.<init>(r1)
            r3.zza = r0
            com.google.android.gms.internal.ads.zzaec r0 = new com.google.android.gms.internal.ads.zzaec
            r1 = -1
            java.lang.String r2 = "image/avif"
            r0.<init>(r1, r1, r2)
            r3.zzb = r0
            return
    }

    private final boolean zza(com.google.android.gms.internal.ads.zzadc r5, int r6) throws java.io.IOException {
            r4 = this;
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            r1 = 4
            r0.zzI(r1)
            com.google.android.gms.internal.ads.zzek r0 = r4.zza
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzacq r5 = (com.google.android.gms.internal.ads.zzacq) r5
            r2 = 0
            r5.zzm(r0, r2, r1, r2)
            com.google.android.gms.internal.ads.zzek r5 = r4.zza
            long r0 = r5.zzu()
            long r5 = (long) r6
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L1f
            r5 = 1
            return r5
        L1f:
            return r2
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
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            com.google.android.gms.internal.ads.zzacq r0 = (com.google.android.gms.internal.ads.zzacq) r0
            r1 = 4
            r2 = 0
            r0.zzl(r1, r2)
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            boolean r0 = r3.zza(r4, r0)
            if (r0 == 0) goto L1c
            r0 = 1635150182(0x61766966, float:2.8409336E20)
            boolean r4 = r3.zza(r4, r0)
            if (r4 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            return r2
    }
}
