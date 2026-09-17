package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzdg extends com.google.android.gms.internal.consent_sdk.zzdd {
    static final com.google.android.gms.internal.consent_sdk.zzdd zza = null;
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    static {
            com.google.android.gms.internal.consent_sdk.zzdg r0 = new com.google.android.gms.internal.consent_sdk.zzdg
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.android.gms.internal.consent_sdk.zzdg.zza = r0
            return
    }

    zzdg(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzc
            java.lang.String r1 = "index"
            com.google.android.gms.internal.consent_sdk.zzcw.zza(r3, r0, r1)
            java.lang.Object[] r0 = r2.zzb
            r3 = r0[r3]
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdd, com.google.android.gms.internal.consent_sdk.zzda
    final int zza(java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.Object[] r4 = r2.zzb
            int r0 = r2.zzc
            r1 = 0
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
            int r3 = r2.zzc
            return r3
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zzb() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final java.lang.Object[] zze() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzb
            return r0
    }
}
