package com.google.android.gms.drive.metadata.internal;

import android.os.Parcelable;

/* loaded from: classes.dex */
public class zzl<T extends android.os.Parcelable> extends com.google.android.gms.drive.metadata.zzb<T> {
    public zzl(java.lang.String r1, java.util.Collection<java.lang.String> r2, java.util.Collection<java.lang.String> r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r3, java.lang.Object r4) {
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.String r0 = r2.getName()
            boolean r1 = r4 instanceof java.util.ArrayList
            if (r1 == 0) goto Ld
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            goto L13
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r4 = r1
        L13:
            r3.putParcelableArrayList(r0, r4)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected /* synthetic */ java.lang.Object zzb(android.os.Bundle r1) {
            r0 = this;
            java.util.Collection r1 = r0.zzc(r1)
            return r1
    }

    protected java.util.Collection<T> zzc(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            java.util.ArrayList r2 = r2.getParcelableArrayList(r0)
            return r2
    }
}
