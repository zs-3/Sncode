package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzdh extends com.google.android.gms.internal.consent_sdk.zzde {
    static final com.google.android.gms.internal.consent_sdk.zzdh zza = null;
    private static final java.lang.Object[] zzd = null;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
            r0 = 0
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.google.android.gms.internal.consent_sdk.zzdh.zzd = r4
            com.google.android.gms.internal.consent_sdk.zzdh r0 = new com.google.android.gms.internal.consent_sdk.zzdh
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.consent_sdk.zzdh.zza = r0
            return
    }

    zzdh(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4, int r5) {
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
            r0 = 0
            if (r5 == 0) goto L24
            java.lang.Object[] r1 = r4.zzc
            int r2 = r1.length
            if (r2 != 0) goto L9
            goto L24
        L9:
            int r2 = r5.hashCode()
            int r2 = com.google.android.gms.internal.consent_sdk.zzcz.zza(r2)
        L11:
            int r3 = r4.zzf
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L19
            return r0
        L19:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L21
            r5 = 1
            return r5
        L21:
            int r2 = r2 + 1
            goto L11
        L24:
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzda, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r2.zzg()
            r1 = 0
            com.google.android.gms.internal.consent_sdk.zzdk r0 = r0.zzh(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zza(java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.Object[] r4 = r2.zzb
            int r0 = r2.zzg
            r1 = 0
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
            int r3 = r2.zzg
            return r3
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zzb() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzda
    public final com.google.android.gms.internal.consent_sdk.zzdj zzd() {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r2.zzg()
            r1 = 0
            com.google.android.gms.internal.consent_sdk.zzdk r0 = r0.zzh(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final java.lang.Object[] zze() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde
    final com.google.android.gms.internal.consent_sdk.zzdd zzh() {
            r2 = this;
            java.lang.Object[] r0 = r2.zzb
            int r1 = r2.zzg
            com.google.android.gms.internal.consent_sdk.zzdd r0 = com.google.android.gms.internal.consent_sdk.zzdd.zzg(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde
    final boolean zzk() {
            r1 = this;
            r0 = 1
            return r0
    }
}
