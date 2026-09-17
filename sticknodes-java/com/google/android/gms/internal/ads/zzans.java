package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzans implements com.google.android.gms.internal.ads.zzaoa {
    private com.google.android.gms.internal.ads.zzaf zza;
    private com.google.android.gms.internal.ads.zzer zzb;
    private com.google.android.gms.internal.ads.zzaeh zzc;

    public zzans(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r0.zzZ(r2)
            com.google.android.gms.internal.ads.zzaf r2 = r0.zzaf()
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zza(com.google.android.gms.internal.ads.zzek r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzer r0 = r8.zzb
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzer r0 = r8.zzb
            long r2 = r0.zze()
            com.google.android.gms.internal.ads.zzer r0 = r8.zzb
            long r0 = r0.zzf()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L4c
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L21
            goto L4c
        L21:
            com.google.android.gms.internal.ads.zzaf r4 = r8.zza
            long r5 = r4.zzs
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L3b
            com.google.android.gms.internal.ads.zzad r4 = r4.zzb()
            r4.zzad(r0)
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzaf()
            r8.zza = r0
            com.google.android.gms.internal.ads.zzaeh r1 = r8.zzc
            r1.zzl(r0)
        L3b:
            int r5 = r9.zzb()
            com.google.android.gms.internal.ads.zzaeh r0 = r8.zzc
            r0.zzq(r9, r5)
            com.google.android.gms.internal.ads.zzaeh r1 = r8.zzc
            r4 = 1
            r6 = 0
            r7 = 0
            r1.zzs(r2, r4, r5, r6, r7)
        L4c:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zzb(com.google.android.gms.internal.ads.zzer r1, com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaon r3) {
            r0 = this;
            r0.zzb = r1
            r3.zzc()
            int r1 = r3.zza()
            r3 = 5
            com.google.android.gms.internal.ads.zzaeh r1 = r2.zzw(r1, r3)
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzaf r2 = r0.zza
            r1.zzl(r2)
            return
    }
}
