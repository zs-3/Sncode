package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaod {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzaeh[] zzb;
    private final com.google.android.gms.internal.ads.zzfw zzc;

    public zzaod(java.util.List r2) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            int r2 = r2.size()
            com.google.android.gms.internal.ads.zzaeh[] r2 = new com.google.android.gms.internal.ads.zzaeh[r2]
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzfw r2 = new com.google.android.gms.internal.ads.zzfw
            com.google.android.gms.internal.ads.zzaoc r0 = new com.google.android.gms.internal.ads.zzaoc
            r0.<init>(r1)
            r2.<init>(r0)
            r1.zzc = r2
            return
    }

    public final void zza(long r2, com.google.android.gms.internal.ads.zzek r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfw r0 = r1.zzc
            r0.zzb(r2, r4)
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzade r9, com.google.android.gms.internal.ads.zzaon r10) {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzaeh[] r2 = r8.zzb
            int r2 = r2.length
            if (r1 >= r2) goto L72
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
            java.lang.String r5 = r3.zza
            if (r5 != 0) goto L45
            java.lang.String r5 = r10.zzb()
        L45:
            com.google.android.gms.internal.ads.zzad r6 = new com.google.android.gms.internal.ads.zzad
            r6.<init>()
            r6.zzL(r5)
            r6.zzZ(r4)
            int r4 = r3.zze
            r6.zzab(r4)
            java.lang.String r4 = r3.zzd
            r6.zzP(r4)
            int r4 = r3.zzG
            r6.zzx(r4)
            java.util.List r3 = r3.zzq
            r6.zzM(r3)
            com.google.android.gms.internal.ads.zzaf r3 = r6.zzaf()
            r2.zzl(r3)
            com.google.android.gms.internal.ads.zzaeh[] r3 = r8.zzb
            r3[r1] = r2
            int r1 = r1 + 1
            goto L2
        L72:
            return
    }

    public final void zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfw r0 = r1.zzc
            r0.zzc()
            return
    }

    final /* synthetic */ void zzd(long r2, com.google.android.gms.internal.ads.zzek r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaeh[] r0 = r1.zzb
            com.google.android.gms.internal.ads.zzacn.zza(r2, r4, r0)
            return
    }

    public final void zze(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfw r0 = r1.zzc
            r0.zzd(r2)
            return
    }
}
