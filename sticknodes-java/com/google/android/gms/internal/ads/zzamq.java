package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamq implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzamr zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private boolean zzc;

    public zzamq() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzamr r0 = new com.google.android.gms.internal.ads.zzamr
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            r3.zza = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 2786(0xae2, float:3.904E-42)
            r0.<init>(r1)
            r3.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r4, com.google.android.gms.internal.ads.zzadx r5) throws java.io.IOException {
            r3 = this;
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            byte[] r5 = r5.zzN()
            r0 = 0
            r1 = 2786(0xae2, float:3.904E-42)
            int r4 = r4.zza(r5, r0, r1)
            r5 = -1
            if (r4 != r5) goto L11
            return r5
        L11:
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            r5.zzL(r0)
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            r5.zzK(r4)
            boolean r4 = r3.zzc
            if (r4 != 0) goto L2a
            com.google.android.gms.internal.ads.zzamr r4 = r3.zza
            r1 = 0
            r5 = 4
            r4.zzd(r1, r5)
            r4 = 1
            r3.zzc = r4
        L2a:
            com.google.android.gms.internal.ads.zzamr r4 = r3.zza
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            r4.zza(r5)
            return r0
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
    public final void zze(com.google.android.gms.internal.ads.zzade r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzaon r0 = new com.google.android.gms.internal.ads.zzaon
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzamr r1 = r5.zza
            r1.zzb(r6, r0)
            r6.zzD()
            com.google.android.gms.internal.ads.zzadz r0 = new com.google.android.gms.internal.ads.zzadz
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r0.<init>(r1, r3)
            r6.zzO(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzamr r1 = r0.zza
            r1.zze()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r9) throws java.io.IOException {
            r8 = this;
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzN()
            r5 = r9
            com.google.android.gms.internal.ads.zzacq r5 = (com.google.android.gms.internal.ads.zzacq) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzL(r2)
            int r4 = r0.zzo()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.zzj()
            r4 = r9
            com.google.android.gms.internal.ads.zzacq r4 = (com.google.android.gms.internal.ads.zzacq) r4
            r4.zzl(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.zzN()
            r7 = 6
            r4.zzm(r6, r2, r7, r2)
            r0.zzL(r2)
            int r6 = r0.zzq()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L4c
            r4.zzl(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.zzN()
            int r6 = com.google.android.gms.internal.ads.zzacb.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.zzl(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.zzM(r4)
            int r4 = r0.zzl()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
    }
}
