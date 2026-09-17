package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzax extends com.google.android.gms.internal.fido.zzau {
    static final com.google.android.gms.internal.fido.zzax zza = null;
    private static final java.lang.Object[] zzd = null;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
            r0 = 0
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.google.android.gms.internal.fido.zzax.zzd = r4
            com.google.android.gms.internal.fido.zzax r0 = new com.google.android.gms.internal.fido.zzax
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.fido.zzax.zza = r0
            return
    }

    zzax(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zze = r2
            r0.zzc = r3
            r0.zzf = r4
            r0.zzg = r5
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.zzc
            r1 = 0
            if (r5 == 0) goto L24
            int r2 = r0.length
            if (r2 != 0) goto L9
            goto L24
        L9:
            int r2 = r5.hashCode()
            int r2 = com.google.android.gms.internal.fido.zzap.zza(r2)
        L11:
            int r3 = r4.zzf
            r2 = r2 & r3
            r3 = r0[r2]
            if (r3 != 0) goto L19
            return r1
        L19:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L21
            r5 = 1
            return r5
        L21:
            int r2 = r2 + 1
            goto L11
        L24:
            return r1
    }

    @Override // com.google.android.gms.internal.fido.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.fido.zzat r0 = r2.zzg()
            r1 = 0
            com.google.android.gms.internal.fido.zzba r0 = r0.zzh(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zza(java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.Object[] r4 = r2.zzb
            int r0 = r2.zzg
            r1 = 0
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
            int r3 = r2.zzg
            return r3
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zzb() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq
    public final com.google.android.gms.internal.fido.zzaz zzd() {
            r2 = this;
            com.google.android.gms.internal.fido.zzat r0 = r2.zzg()
            r1 = 0
            com.google.android.gms.internal.fido.zzba r0 = r0.zzh(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final java.lang.Object[] zze() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzau
    final com.google.android.gms.internal.fido.zzat zzh() {
            r2 = this;
            java.lang.Object[] r0 = r2.zzb
            int r1 = r2.zzg
            com.google.android.gms.internal.fido.zzat r0 = com.google.android.gms.internal.fido.zzat.zzg(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzau
    final boolean zzj() {
            r1 = this;
            r0 = 1
            return r0
    }
}
