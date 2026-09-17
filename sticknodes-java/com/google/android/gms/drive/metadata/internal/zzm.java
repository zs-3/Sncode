package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public abstract class zzm<T extends com.google.android.gms.common.internal.ReflectedParcelable> extends com.google.android.gms.drive.metadata.zza<T> {
    public zzm(java.lang.String r1, java.util.Collection<java.lang.String> r2, java.util.Collection<java.lang.String> r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.common.internal.ReflectedParcelable r3 = (com.google.android.gms.common.internal.ReflectedParcelable) r3
            java.lang.String r0 = r1.getName()
            r2.putParcelable(r0, r3)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.gms.common.internal.ReflectedParcelable r2 = (com.google.android.gms.common.internal.ReflectedParcelable) r2
            return r2
    }
}
