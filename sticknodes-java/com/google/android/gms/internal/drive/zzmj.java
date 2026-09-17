package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzmj extends com.google.android.gms.internal.drive.zzmi {
    zzmj(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzmi
    public final void zzbp() {
            r3 = this;
            boolean r0 = r3.isImmutable()
            if (r0 != 0) goto L5b
            r0 = 0
        L7:
            int r1 = r3.zzer()
            if (r0 >= r1) goto L2d
            java.util.Map$Entry r1 = r3.zzaw(r0)
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.drive.zzkd r2 = (com.google.android.gms.internal.drive.zzkd) r2
            boolean r2 = r2.zzcs()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
        L2a:
            int r0 = r0 + 1
            goto L7
        L2d:
            java.lang.Iterable r0 = r3.zzes()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.drive.zzkd r2 = (com.google.android.gms.internal.drive.zzkd) r2
            boolean r2 = r2.zzcs()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
            goto L35
        L5b:
            super.zzbp()
            return
    }
}
