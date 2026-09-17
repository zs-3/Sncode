package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaoq {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzaeh[] zzb;

    public zzaoq(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            int r1 = r1.size()
            com.google.android.gms.internal.ads.zzaeh[] r1 = new com.google.android.gms.internal.ads.zzaeh[r1]
            r0.zzb = r1
            return
    }

    public final void zza(long r5, com.google.android.gms.internal.ads.zzek r7) {
            r4 = this;
            int r0 = r7.zzb()
            r1 = 9
            if (r0 >= r1) goto L9
            goto L26
        L9:
            int r0 = r7.zzg()
            int r1 = r7.zzg()
            int r2 = r7.zzm()
            r3 = 434(0x1b2, float:6.08E-43)
            if (r0 != r3) goto L26
            r0 = 1195456820(0x47413934, float:49465.203)
            if (r1 != r0) goto L26
            r0 = 3
            if (r2 != r0) goto L26
            com.google.android.gms.internal.ads.zzaeh[] r0 = r4.zzb
            com.google.android.gms.internal.ads.zzacn.zzb(r5, r7, r0)
        L26:
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzade r9, com.google.android.gms.internal.ads.zzaon r10) {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzaeh[] r2 = r8.zzb
            int r2 = r2.length
            if (r1 >= r2) goto L6e
            r10.zzc()
            int r2 = r10.zza()
            r3 = 3
            com.google.android.gms.internal.ads.zzaeh r2 = r9.zzw(r2, r3)
            java.util.List r3 = r8.zza
            java.lang.Object r3 = r3.get(r1)
            com.google.android.gms.internal.ads.zzaf r3 = (com.google.android.gms.internal.ads.zzaf) r3
            java.lang.String r4 = r3.zzn
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r5.equals(r4)
            r6 = 1
            if (r5 != 0) goto L30
            java.lang.String r5 = "application/cea-708"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L2f
            goto L30
        L2f:
            r6 = 0
        L30:
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r7 = "Invalid closed caption MIME type provided: "
            java.lang.String r5 = r7.concat(r5)
            com.google.android.gms.internal.ads.zzdi.zze(r6, r5)
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad
            r5.<init>()
            java.lang.String r6 = r10.zzb()
            r5.zzL(r6)
            r5.zzZ(r4)
            int r4 = r3.zze
            r5.zzab(r4)
            java.lang.String r4 = r3.zzd
            r5.zzP(r4)
            int r4 = r3.zzG
            r5.zzx(r4)
            java.util.List r3 = r3.zzq
            r5.zzM(r3)
            com.google.android.gms.internal.ads.zzaf r3 = r5.zzaf()
            r2.zzl(r3)
            com.google.android.gms.internal.ads.zzaeh[] r3 = r8.zzb
            r3[r1] = r2
            int r1 = r1 + 1
            goto L2
        L6e:
            return
    }
}
