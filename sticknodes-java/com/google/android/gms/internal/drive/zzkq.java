package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public class zzkq extends java.io.IOException {
    private com.google.android.gms.internal.drive.zzlq zzsq;

    public zzkq(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzsq = r1
            return
    }

    static com.google.android.gms.internal.drive.zzkq zzdi() {
            com.google.android.gms.internal.drive.zzkq r0 = new com.google.android.gms.internal.drive.zzkq
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.drive.zzkq zzdj() {
            com.google.android.gms.internal.drive.zzkq r0 = new com.google.android.gms.internal.drive.zzkq
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.drive.zzkq zzdk() {
            com.google.android.gms.internal.drive.zzkq r0 = new com.google.android.gms.internal.drive.zzkq
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.drive.zzkr zzdl() {
            com.google.android.gms.internal.drive.zzkr r0 = new com.google.android.gms.internal.drive.zzkr
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.drive.zzkq zzdm() {
            com.google.android.gms.internal.drive.zzkq r0 = new com.google.android.gms.internal.drive.zzkq
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.drive.zzkq zzdn() {
            com.google.android.gms.internal.drive.zzkq r0 = new com.google.android.gms.internal.drive.zzkq
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    public final com.google.android.gms.internal.drive.zzkq zzg(com.google.android.gms.internal.drive.zzlq r1) {
            r0 = this;
            r0.zzsq = r1
            return r0
    }
}
