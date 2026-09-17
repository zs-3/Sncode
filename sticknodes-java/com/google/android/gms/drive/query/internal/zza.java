package com.google.android.gms.drive.query.internal;

/* loaded from: classes.dex */
public abstract class zza extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.query.Filter {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.drive.query.zzd r1 = new com.google.android.gms.drive.query.zzd
            r1.<init>()
            java.lang.Object r1 = r3.zza(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Filter[%s]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
