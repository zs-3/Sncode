package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class Drive {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API = null;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.drive.zzaw> CLIENT_KEY = null;

    @java.lang.Deprecated
    public static final com.google.android.gms.drive.DriveApi DriveApi = null;

    @java.lang.Deprecated
    public static final com.google.android.gms.drive.DrivePreferencesApi DrivePreferencesApi = null;
    public static final com.google.android.gms.common.api.Scope SCOPE_APPFOLDER = null;
    public static final com.google.android.gms.common.api.Scope SCOPE_FILE = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzq = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Drive.zzb> zzr = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Drive.zza> zzs = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    private static final com.google.android.gms.common.api.Scope zzt = null;
    private static final com.google.android.gms.common.api.Scope zzu = null;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive.zzb> zzv = null;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive.zza> zzw = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    @java.lang.Deprecated
    private static final com.google.android.gms.drive.zzj zzx = null;
    private static final com.google.android.gms.drive.zzl zzy = null;

    public static class zza implements com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions {
        private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zzaa;
        private final android.os.Bundle zzz;

        public zza(com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.zzz = r0
                r1.zzaa = r2
                return
        }

        public final boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r6 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r6 == 0) goto L5c
                java.lang.Class r2 = r6.getClass()
                java.lang.Class<com.google.android.gms.drive.Drive$zza> r3 = com.google.android.gms.drive.Drive.zza.class
                if (r2 == r3) goto L10
                goto L5c
            L10:
                com.google.android.gms.drive.Drive$zza r6 = (com.google.android.gms.drive.Drive.zza) r6
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r5.zzaa
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = r6.getGoogleSignInAccount()
                boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
                if (r2 != 0) goto L1f
                return r1
            L1f:
                android.os.Bundle r2 = r5.zzz
                java.lang.String r3 = "method_trace_filename"
                java.lang.String r2 = r2.getString(r3)
                android.os.Bundle r4 = r6.zzz
                java.lang.String r3 = r4.getString(r3)
                if (r2 != 0) goto L31
                if (r3 == 0) goto L3b
            L31:
                if (r2 == 0) goto L5c
                if (r3 == 0) goto L5c
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L5c
            L3b:
                android.os.Bundle r2 = r5.zzz
                java.lang.String r3 = "bypass_initial_sync"
                boolean r2 = r2.getBoolean(r3)
                android.os.Bundle r4 = r6.zzz
                boolean r3 = r4.getBoolean(r3)
                if (r2 != r3) goto L5c
                android.os.Bundle r2 = r5.zzz
                java.lang.String r3 = "proxy_type"
                int r2 = r2.getInt(r3)
                android.os.Bundle r6 = r6.zzz
                int r6 = r6.getInt(r3)
                if (r2 != r6) goto L5c
                return r0
            L5c:
                return r1
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
        public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
                r1 = this;
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r1.zzaa
                return r0
        }

        public final int hashCode() {
                r6 = this;
                android.os.Bundle r0 = r6.zzz
                java.lang.String r1 = "method_trace_filename"
                java.lang.String r2 = ""
                java.lang.String r0 = r0.getString(r1, r2)
                android.os.Bundle r1 = r6.zzz
                java.lang.String r2 = "proxy_type"
                int r1 = r1.getInt(r2)
                android.os.Bundle r2 = r6.zzz
                java.lang.String r3 = "bypass_initial_sync"
                boolean r2 = r2.getBoolean(r3)
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = r6.zzaa
                r5 = 0
                r3[r5] = r4
                r4 = 1
                r3[r4] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r1 = 2
                r3[r1] = r0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                r1 = 3
                r3[r1] = r0
                int r0 = com.google.android.gms.common.internal.Objects.hashCode(r3)
                return r0
        }

        public final android.os.Bundle zzh() {
                r1 = this;
                android.os.Bundle r0 = r1.zzz
                return r0
        }
    }

    public static class zzb implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    }

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.drive.Drive.CLIENT_KEY = r0
            com.google.android.gms.drive.zze r1 = new com.google.android.gms.drive.zze
            r1.<init>()
            com.google.android.gms.drive.Drive.zzq = r1
            com.google.android.gms.drive.zzf r2 = new com.google.android.gms.drive.zzf
            r2.<init>()
            com.google.android.gms.drive.Drive.zzr = r2
            com.google.android.gms.drive.zzg r3 = new com.google.android.gms.drive.zzg
            r3.<init>()
            com.google.android.gms.drive.Drive.zzs = r3
            com.google.android.gms.common.api.Scope r4 = new com.google.android.gms.common.api.Scope
            java.lang.String r5 = "https://www.googleapis.com/auth/drive.file"
            r4.<init>(r5)
            com.google.android.gms.drive.Drive.SCOPE_FILE = r4
            com.google.android.gms.common.api.Scope r4 = new com.google.android.gms.common.api.Scope
            java.lang.String r5 = "https://www.googleapis.com/auth/drive.appdata"
            r4.<init>(r5)
            com.google.android.gms.drive.Drive.SCOPE_APPFOLDER = r4
            com.google.android.gms.common.api.Scope r4 = new com.google.android.gms.common.api.Scope
            java.lang.String r5 = "https://www.googleapis.com/auth/drive"
            r4.<init>(r5)
            com.google.android.gms.drive.Drive.zzt = r4
            com.google.android.gms.common.api.Scope r4 = new com.google.android.gms.common.api.Scope
            java.lang.String r5 = "https://www.googleapis.com/auth/drive.apps"
            r4.<init>(r5)
            com.google.android.gms.drive.Drive.zzu = r4
            com.google.android.gms.common.api.Api r4 = new com.google.android.gms.common.api.Api
            java.lang.String r5 = "Drive.API"
            r4.<init>(r5, r1, r0)
            com.google.android.gms.drive.Drive.API = r4
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            java.lang.String r4 = "Drive.INTERNAL_API"
            r1.<init>(r4, r2, r0)
            com.google.android.gms.drive.Drive.zzv = r1
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            java.lang.String r2 = "Drive.API_CONNECTIONLESS"
            r1.<init>(r2, r3, r0)
            com.google.android.gms.drive.Drive.zzw = r1
            com.google.android.gms.internal.drive.zzaf r0 = new com.google.android.gms.internal.drive.zzaf
            r0.<init>()
            com.google.android.gms.drive.Drive.DriveApi = r0
            com.google.android.gms.internal.drive.zzbr r0 = new com.google.android.gms.internal.drive.zzbr
            r0.<init>()
            com.google.android.gms.drive.Drive.zzx = r0
            com.google.android.gms.internal.drive.zzeb r0 = new com.google.android.gms.internal.drive.zzeb
            r0.<init>()
            com.google.android.gms.drive.Drive.zzy = r0
            com.google.android.gms.internal.drive.zzcb r0 = new com.google.android.gms.internal.drive.zzcb
            r0.<init>()
            com.google.android.gms.drive.Drive.DrivePreferencesApi = r0
            return
    }

    private Drive() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveClient getDriveClient(android.app.Activity r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3) {
            zza(r3)
            com.google.android.gms.internal.drive.zzbb r0 = new com.google.android.gms.internal.drive.zzbb
            com.google.android.gms.drive.Drive$zza r1 = new com.google.android.gms.drive.Drive$zza
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveClient getDriveClient(android.content.Context r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3) {
            zza(r3)
            com.google.android.gms.internal.drive.zzbb r0 = new com.google.android.gms.internal.drive.zzbb
            com.google.android.gms.drive.Drive$zza r1 = new com.google.android.gms.drive.Drive$zza
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveResourceClient getDriveResourceClient(android.app.Activity r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3) {
            zza(r3)
            com.google.android.gms.internal.drive.zzch r0 = new com.google.android.gms.internal.drive.zzch
            com.google.android.gms.drive.Drive$zza r1 = new com.google.android.gms.drive.Drive$zza
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveResourceClient getDriveResourceClient(android.content.Context r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3) {
            zza(r3)
            com.google.android.gms.internal.drive.zzch r0 = new com.google.android.gms.internal.drive.zzch
            com.google.android.gms.drive.Drive$zza r1 = new com.google.android.gms.drive.Drive$zza
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    private static void zza(com.google.android.gms.auth.api.signin.GoogleSignInAccount r1) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.util.Set r1 = r1.getRequestedScopes()
            com.google.android.gms.common.api.Scope r0 = com.google.android.gms.drive.Drive.SCOPE_FILE
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L2a
            com.google.android.gms.common.api.Scope r0 = com.google.android.gms.drive.Drive.SCOPE_APPFOLDER
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L2a
            com.google.android.gms.common.api.Scope r0 = com.google.android.gms.drive.Drive.zzt
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L2a
            com.google.android.gms.common.api.Scope r0 = com.google.android.gms.drive.Drive.zzu
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L28
            goto L2a
        L28:
            r1 = 0
            goto L2b
        L2a:
            r1 = 1
        L2b:
            java.lang.String r0 = "You must request a Drive scope in order to interact with the Drive API."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            return
    }
}
