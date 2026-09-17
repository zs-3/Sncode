package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzlh implements com.google.android.gms.internal.drive.zzlp {
    private com.google.android.gms.internal.drive.zzlp[] zztt;

    zzlh(com.google.android.gms.internal.drive.zzlp... r1) {
            r0 = this;
            r0.<init>()
            r0.zztt = r1
            return
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final boolean zzb(java.lang.Class<?> r6) {
            r5 = this;
            com.google.android.gms.internal.drive.zzlp[] r0 = r5.zztt
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L14
            r4 = r0[r3]
            boolean r4 = r4.zzb(r6)
            if (r4 == 0) goto L11
            r6 = 1
            return r6
        L11:
            int r3 = r3 + 1
            goto L5
        L14:
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final com.google.android.gms.internal.drive.zzlo zzc(java.lang.Class<?> r6) {
            r5 = this;
            com.google.android.gms.internal.drive.zzlp[] r0 = r5.zztt
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            boolean r4 = r3.zzb(r6)
            if (r4 == 0) goto L13
            com.google.android.gms.internal.drive.zzlo r6 = r3.zzc(r6)
            return r6
        L13:
            int r2 = r2 + 1
            goto L4
        L16:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "No factory is available for message type: "
            java.lang.String r6 = r6.getName()
            int r2 = r6.length()
            if (r2 == 0) goto L29
            java.lang.String r6 = r1.concat(r6)
            goto L2e
        L29:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
        L2e:
            r0.<init>(r6)
            throw r0
    }
}
