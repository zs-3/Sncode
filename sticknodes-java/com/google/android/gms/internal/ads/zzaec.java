package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaec implements com.google.android.gms.internal.ads.zzadb {
    private final int zza;
    private final int zzb;
    private final java.lang.String zzc;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzade zzf;
    private com.google.android.gms.internal.ads.zzaeh zzg;

    public zzaec(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r10, com.google.android.gms.internal.ads.zzadx r11) throws java.io.IOException {
            r9 = this;
            int r11 = r9.zze
            r0 = -1
            r1 = 2
            r2 = 1
            if (r11 == r2) goto L10
            if (r11 != r1) goto La
            return r0
        La:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L10:
            com.google.android.gms.internal.ads.zzaeh r11 = r9.zzg
            java.util.Objects.requireNonNull(r11)
            r3 = 1024(0x400, float:1.435E-42)
            int r10 = r11.zzf(r10, r3, r2)
            r11 = 0
            if (r10 != r0) goto L2f
            r9.zze = r1
            com.google.android.gms.internal.ads.zzaeh r2 = r9.zzg
            r3 = 0
            r5 = 1
            int r6 = r9.zzd
            r7 = 0
            r8 = 0
            r2.zzs(r3, r5, r6, r7, r8)
            r9.zzd = r11
            goto L34
        L2f:
            int r0 = r9.zzd
            int r0 = r0 + r10
            r9.zzd = r0
        L34:
            return r11
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
    public final void zze(com.google.android.gms.internal.ads.zzade r4) {
            r3 = this;
            r3.zzf = r4
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 4
            com.google.android.gms.internal.ads.zzaeh r4 = r4.zzw(r0, r1)
            r3.zzg = r4
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = r3.zzc
            r0.zzZ(r1)
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzaf()
            r4.zzl(r0)
            com.google.android.gms.internal.ads.zzade r4 = r3.zzf
            r4.zzD()
            com.google.android.gms.internal.ads.zzade r4 = r3.zzf
            com.google.android.gms.internal.ads.zzaed r0 = new com.google.android.gms.internal.ads.zzaed
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r1)
            r4.zzO(r0)
            r4 = 1
            r3.zze = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r3, long r5) {
            r2 = this;
            r5 = 1
            r0 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 == 0) goto Ld
            int r3 = r2.zze
            if (r3 != r5) goto Lc
            goto Ld
        Lc:
            return
        Ld:
            r2.zze = r5
            r3 = 0
            r2.zzd = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.zza
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == r2) goto Ld
            int r0 = r5.zzb
            if (r0 == r2) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            int r0 = r5.zzb
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>(r0)
            byte[] r0 = r2.zzN()
            int r4 = r5.zzb
            com.google.android.gms.internal.ads.zzacq r6 = (com.google.android.gms.internal.ads.zzacq) r6
            r6.zzm(r0, r3, r4, r3)
            int r6 = r2.zzq()
            int r0 = r5.zza
            if (r6 != r0) goto L2c
            return r1
        L2c:
            return r3
    }
}
