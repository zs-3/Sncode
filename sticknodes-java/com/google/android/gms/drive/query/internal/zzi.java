package com.google.android.gms.drive.query.internal;

/* loaded from: classes.dex */
final class zzi {
    static com.google.android.gms.drive.metadata.MetadataField<?> zza(com.google.android.gms.drive.metadata.internal.MetadataBundle r2) {
            java.util.Set r2 = r2.zzbg()
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L16
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            com.google.android.gms.drive.metadata.MetadataField r2 = (com.google.android.gms.drive.metadata.MetadataField) r2
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bundle should have exactly 1 populated field"
            r2.<init>(r0)
            throw r2
    }
}
