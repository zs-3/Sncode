package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzlp extends com.google.android.gms.internal.ads.zzhr {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final com.google.android.gms.internal.ads.zzcc[] zzg;
    private final java.lang.Object[] zzh;
    private final java.util.HashMap zzi;

    public zzlp(java.util.Collection r7, com.google.android.gms.internal.ads.zzwq r8) {
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzcc[] r0 = new com.google.android.gms.internal.ads.zzcc[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = 0
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzky r4 = (com.google.android.gms.internal.ads.zzky) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzcc r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzky r3 = (com.google.android.gms.internal.ads.zzky) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
    }

    private zzlp(com.google.android.gms.internal.ads.zzcc[] r7, java.lang.Object[] r8, com.google.android.gms.internal.ads.zzwq r9) {
            r6 = this;
            r0 = 0
            r6.<init>(r0, r9)
            r6.zzg = r7
            int r9 = r7.length
            int[] r1 = new int[r9]
            r6.zze = r1
            int[] r9 = new int[r9]
            r6.zzf = r9
            r6.zzh = r8
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.zzi = r9
            r9 = 0
            r1 = 0
            r2 = 0
        L1b:
            int r3 = r7.length
            if (r0 >= r3) goto L4b
            r3 = r7[r0]
            com.google.android.gms.internal.ads.zzcc[] r4 = r6.zzg
            r4[r2] = r3
            int[] r4 = r6.zzf
            r4[r2] = r9
            int[] r4 = r6.zze
            r4[r2] = r1
            int r3 = r3.zzc()
            int r9 = r9 + r3
            com.google.android.gms.internal.ads.zzcc[] r3 = r6.zzg
            r3 = r3[r2]
            int r3 = r3.zzb()
            int r1 = r1 + r3
            java.util.HashMap r3 = r6.zzi
            r4 = r8[r2]
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.put(r4, r2)
            int r0 = r0 + 1
            r2 = r5
            goto L1b
        L4b:
            r6.zzc = r9
            r6.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzc() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final int zzp(java.lang.Object r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzi
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lc
            r2 = -1
            return r2
        Lc:
            int r2 = r2.intValue()
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final int zzq(int r3) {
            r2 = this;
            int[] r0 = r2.zze
            int r3 = r3 + 1
            r1 = 0
            int r3 = com.google.android.gms.internal.ads.zzeu.zzb(r0, r3, r1, r1)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final int zzr(int r3) {
            r2 = this;
            int[] r0 = r2.zzf
            int r3 = r3 + 1
            r1 = 0
            int r3 = com.google.android.gms.internal.ads.zzeu.zzb(r0, r3, r1, r1)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final int zzs(int r2) {
            r1 = this;
            int[] r0 = r1.zze
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final int zzt(int r2) {
            r1 = this;
            int[] r0 = r1.zzf
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final com.google.android.gms.internal.ads.zzcc zzu(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcc[] r0 = r1.zzg
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final java.lang.Object zzv(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.zzh
            r2 = r0[r2]
            return r2
    }

    final java.util.List zzw() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcc[] r0 = r1.zzg
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzlp zzx(com.google.android.gms.internal.ads.zzwq r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzcc[] r0 = r4.zzg
            int r0 = r0.length
            com.google.android.gms.internal.ads.zzcc[] r0 = new com.google.android.gms.internal.ads.zzcc[r0]
            r1 = 0
        L6:
            com.google.android.gms.internal.ads.zzcc[] r2 = r4.zzg
            int r3 = r2.length
            if (r1 >= r3) goto L17
            com.google.android.gms.internal.ads.zzlo r3 = new com.google.android.gms.internal.ads.zzlo
            r2 = r2[r1]
            r3.<init>(r4, r2)
            r0[r1] = r3
            int r1 = r1 + 1
            goto L6
        L17:
            java.lang.Object[] r1 = r4.zzh
            com.google.android.gms.internal.ads.zzlp r2 = new com.google.android.gms.internal.ads.zzlp
            r2.<init>(r0, r1, r5)
            return r2
    }
}
