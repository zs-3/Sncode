package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzrd implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzrd zza = null;
    private final com.google.common.base.Supplier zzb;

    static {
            com.google.android.gms.internal.measurement.zzrd r0 = new com.google.android.gms.internal.measurement.zzrd
            r0.<init>()
            com.google.android.gms.internal.measurement.zzrd.zza = r0
            return
    }

    public zzrd() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzrf r0 = new com.google.android.gms.internal.measurement.zzrf
            r0.<init>()
            com.google.common.base.Supplier r0 = com.google.common.base.Suppliers.ofInstance(r0)
            r1.zzb = r0
            return
    }

    public static boolean zzb() {
            com.google.android.gms.internal.measurement.zzrd r0 = com.google.android.gms.internal.measurement.zzrd.zza
            com.google.android.gms.internal.measurement.zzre r0 = r0.zza()
            r0.zza()
            r0 = 1
            return r0
    }

    public static boolean zzc() {
            com.google.android.gms.internal.measurement.zzrd r0 = com.google.android.gms.internal.measurement.zzrd.zza
            com.google.android.gms.internal.measurement.zzre r0 = r0.zza()
            boolean r0 = r0.zzb()
            return r0
    }

    @Override // com.google.common.base.Supplier
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzre r0 = r1.zza()
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzre zza() {
            r1 = this;
            com.google.common.base.Supplier r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.measurement.zzre r0 = (com.google.android.gms.internal.measurement.zzre) r0
            return r0
    }
}
