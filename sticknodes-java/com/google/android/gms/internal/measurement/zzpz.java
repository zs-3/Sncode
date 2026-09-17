package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzpz implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzpz zza = null;
    private final com.google.common.base.Supplier zzb;

    static {
            com.google.android.gms.internal.measurement.zzpz r0 = new com.google.android.gms.internal.measurement.zzpz
            r0.<init>()
            com.google.android.gms.internal.measurement.zzpz.zza = r0
            return
    }

    public zzpz() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzqb r0 = new com.google.android.gms.internal.measurement.zzqb
            r0.<init>()
            com.google.common.base.Supplier r0 = com.google.common.base.Suppliers.ofInstance(r0)
            r1.zzb = r0
            return
    }

    public static boolean zzb() {
            com.google.android.gms.internal.measurement.zzpz r0 = com.google.android.gms.internal.measurement.zzpz.zza
            com.google.android.gms.internal.measurement.zzqa r0 = r0.zza()
            boolean r0 = r0.zza()
            return r0
    }

    @Override // com.google.common.base.Supplier
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzqa r0 = r1.zza()
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzqa zza() {
            r1 = this;
            com.google.common.base.Supplier r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.measurement.zzqa r0 = (com.google.android.gms.internal.measurement.zzqa) r0
            return r0
    }
}
