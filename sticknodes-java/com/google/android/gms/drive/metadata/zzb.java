package com.google.android.gms.drive.metadata;

/* loaded from: classes.dex */
public abstract class zzb<T> extends com.google.android.gms.drive.metadata.zza<java.util.Collection<T>> {
    protected zzb(java.lang.String r1, java.util.Collection<java.lang.String> r2, java.util.Collection<java.lang.String> r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.util.Collection r1 = r0.zzd(r1, r2, r3)
            return r1
    }

    protected java.util.Collection<T> zzd(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Cannot read collections from a dataHolder."
            r1.<init>(r2)
            throw r1
    }
}
