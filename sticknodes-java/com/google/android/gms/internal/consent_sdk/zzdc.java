package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzdc extends com.google.android.gms.internal.consent_sdk.zzdd {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzdd zzc;

    zzdc(com.google.android.gms.internal.consent_sdk.zzdd r1, int r2, int r3) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzb
            java.lang.String r1 = "index"
            com.google.android.gms.internal.consent_sdk.zzcw.zza(r3, r0, r1)
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r2.zzc
            int r1 = r2.zza
            int r3 = r3 + r1
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdd, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.consent_sdk.zzdd r1 = r0.zzf(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zzb() {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r2.zzc
            int r0 = r0.zzc()
            int r1 = r2.zza
            int r0 = r0 + r1
            int r1 = r2.zzb
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zzc() {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r2.zzc
            int r0 = r0.zzc()
            int r1 = r2.zza
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final java.lang.Object[] zze() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzdd r0 = r1.zzc
            java.lang.Object[] r0 = r0.zze()
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdd
    public final com.google.android.gms.internal.consent_sdk.zzdd zzf(int r3, int r4) {
            r2 = this;
            int r0 = r2.zzb
            com.google.android.gms.internal.consent_sdk.zzcw.zzc(r3, r4, r0)
            int r0 = r2.zza
            com.google.android.gms.internal.consent_sdk.zzdd r1 = r2.zzc
            int r3 = r3 + r0
            int r4 = r4 + r0
            com.google.android.gms.internal.consent_sdk.zzdd r3 = r1.zzf(r3, r4)
            return r3
    }
}
