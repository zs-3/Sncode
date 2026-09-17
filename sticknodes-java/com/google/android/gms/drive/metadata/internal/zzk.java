package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public final class zzk {
    private java.lang.String zzji;

    private zzk(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            r1.zzji = r2
            return
    }

    public static com.google.android.gms.drive.metadata.internal.zzk zzg(java.lang.String r1) {
            if (r1 == 0) goto Lb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            com.google.android.gms.drive.metadata.internal.zzk r0 = new com.google.android.gms.drive.metadata.internal.zzk
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.google.android.gms.drive.metadata.internal.zzk> r1 = com.google.android.gms.drive.metadata.internal.zzk.class
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            com.google.android.gms.drive.metadata.internal.zzk r3 = (com.google.android.gms.drive.metadata.internal.zzk) r3
            java.lang.String r0 = r2.zzji
            java.lang.String r3 = r3.zzji
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zzji
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isFolder() {
            r2 = this;
            java.lang.String r0 = r2.zzji
            java.lang.String r1 = "application/vnd.google-apps.folder"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzji
            return r0
    }

    public final boolean zzbh() {
            r2 = this;
            java.lang.String r0 = r2.zzji
            java.lang.String r1 = "application/vnd.google-apps"
            boolean r0 = r0.startsWith(r1)
            return r0
    }
}
