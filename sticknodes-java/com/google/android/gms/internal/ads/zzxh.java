package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzxh implements com.google.android.gms.internal.ads.zzyl {
    protected final com.google.android.gms.internal.ads.zzcd zza;
    protected final int zzb;
    protected final int[] zzc;
    private final com.google.android.gms.internal.ads.zzaf[] zzd;
    private int zze;

    public zzxh(com.google.android.gms.internal.ads.zzcd r4, int[] r5, int r6) {
            r3 = this;
            r3.<init>()
            int r6 = r5.length
            r0 = 0
            if (r6 <= 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            com.google.android.gms.internal.ads.zzdi.zzf(r1)
            java.util.Objects.requireNonNull(r4)
            r3.zza = r4
            r3.zzb = r6
            com.google.android.gms.internal.ads.zzaf[] r6 = new com.google.android.gms.internal.ads.zzaf[r6]
            r3.zzd = r6
            r6 = 0
        L19:
            int r1 = r5.length
            if (r6 >= r1) goto L29
            com.google.android.gms.internal.ads.zzaf[] r1 = r3.zzd
            r2 = r5[r6]
            com.google.android.gms.internal.ads.zzaf r2 = r4.zzb(r2)
            r1[r6] = r2
            int r6 = r6 + 1
            goto L19
        L29:
            com.google.android.gms.internal.ads.zzaf[] r5 = r3.zzd
            com.google.android.gms.internal.ads.zzxg r6 = new com.google.android.gms.internal.ads.zzxg
            r6.<init>()
            java.util.Arrays.sort(r5, r6)
            int r5 = r3.zzb
            int[] r5 = new int[r5]
            r3.zzc = r5
        L39:
            int r5 = r3.zzb
            if (r0 >= r5) goto L4c
            int[] r5 = r3.zzc
            com.google.android.gms.internal.ads.zzaf[] r6 = r3.zzd
            r6 = r6[r0]
            int r6 = r4.zza(r6)
            r5[r0] = r6
            int r0 = r0 + 1
            goto L39
        L4c:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L29
        L12:
            com.google.android.gms.internal.ads.zzxh r5 = (com.google.android.gms.internal.ads.zzxh) r5
            com.google.android.gms.internal.ads.zzcd r2 = r4.zza
            com.google.android.gms.internal.ads.zzcd r3 = r5.zza
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            int[] r2 = r4.zzc
            int[] r5 = r5.zzc
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L29
            return r0
        L29:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zze
            if (r0 != 0) goto L15
            com.google.android.gms.internal.ads.zzcd r0 = r2.zza
            int r0 = java.lang.System.identityHashCode(r0)
            int r0 = r0 * 31
            int[] r1 = r2.zzc
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.zze = r0
        L15:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zza(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb(int r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.zzb
            if (r0 >= r1) goto Lf
            int[] r1 = r2.zzc
            r1 = r1[r0]
            if (r1 != r3) goto Lc
            return r0
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            r3 = -1
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzc() {
            r1 = this;
            int[] r0 = r1.zzc
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final com.google.android.gms.internal.ads.zzaf zzd(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaf[] r0 = r1.zzd
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final com.google.android.gms.internal.ads.zzcd zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcd r0 = r1.zza
            return r0
    }
}
