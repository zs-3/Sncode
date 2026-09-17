package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgcp extends com.google.android.gms.internal.ads.zzgbc {
    static final com.google.android.gms.internal.ads.zzgcp zza = null;
    private static final java.lang.Object[] zzd = null;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
            r0 = 0
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.google.android.gms.internal.ads.zzgcp.zzd = r4
            com.google.android.gms.internal.ads.zzgcp r0 = new com.google.android.gms.internal.ads.zzgcp
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzgcp.zza = r0
            return
    }

    zzgcp(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zze = r2
            r0.zzc = r3
            r0.zzf = r4
            r0.zzg = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L20
            java.lang.Object[] r1 = r4.zzc
            int r2 = r1.length
            if (r2 != 0) goto L9
            goto L20
        L9:
            int r2 = com.google.android.gms.internal.ads.zzgap.zzb(r5)
        Ld:
            int r3 = r4.zzf
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L15
            return r0
        L15:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1d
            r5 = 1
            return r5
        L1d:
            int r2 = r2 + 1
            goto Ld
        L20:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r2.zzd()
            r1 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r0.zzu(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final int zza(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.zzb
            int r1 = r3.zzg
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r5, r1)
            int r4 = r3.zzg
            int r5 = r5 + r4
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final int zzb() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    public final com.google.android.gms.internal.ads.zzgdd zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r2.zzd()
            r1 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r0.zzu(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final java.lang.Object[] zzg() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc
    final com.google.android.gms.internal.ads.zzgax zzi() {
            r2 = this;
            java.lang.Object[] r0 = r2.zzb
            int r1 = r2.zzg
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzj(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc
    final boolean zzu() {
            r1 = this;
            r0 = 1
            return r0
    }
}
