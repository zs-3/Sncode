package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.internal.games.zzfp
/* loaded from: classes.dex */
public final class Games {

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.games.Games.GamesOptions> API = null;

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.achievement.Achievements Achievements = null;

    @com.google.android.gms.internal.games.zzfp
    public static final java.lang.String EXTRA_PLAYER_IDS = "players";

    @com.google.android.gms.internal.games.zzfp
    public static final java.lang.String EXTRA_STATUS = "status";

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.event.Events Events = null;

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.GamesMetadata GamesMetadata = null;

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.leaderboard.Leaderboards Leaderboards = null;

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.Players Players = null;

    @com.google.android.gms.internal.games.zzfp
    public static final com.google.android.gms.common.api.Scope SCOPE_GAMES = null;

    @com.google.android.gms.internal.games.zzfp
    public static final com.google.android.gms.common.api.Scope SCOPE_GAMES_LITE = null;

    @com.google.android.gms.internal.games.zzfp
    public static final com.google.android.gms.common.api.Scope SCOPE_GAMES_SNAPSHOTS = null;

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.snapshot.Snapshots Snapshots = null;

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.stats.Stats Stats = null;

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static final com.google.android.gms.games.video.Videos Videos = null;
    static final com.google.android.gms.common.api.Api.ClientKey zza = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final com.google.android.gms.common.api.Scope zzb = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final com.google.android.gms.common.api.Api zzc = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzd = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zze = null;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    public static final class GamesOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions {
        public static final /* synthetic */ int zzp = 0;
        public final boolean zza;
        public final boolean zzb;
        public final int zzc;
        public final boolean zzd;
        public final int zze;
        public final java.lang.String zzf;
        public final java.util.ArrayList zzg;
        public final boolean zzh;
        public final boolean zzi;
        public final boolean zzj;
        public final com.google.android.gms.auth.api.signin.GoogleSignInAccount zzk;
        public final java.lang.String zzl;
        public final int zzm;
        public final java.lang.String zzn;
        public com.google.android.gms.games.internal.zzf zzo;
        private final int zzq;

        /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
        @com.google.android.gms.internal.games.zzfp
        public static final class Builder {
            private static final java.util.concurrent.atomic.AtomicInteger zzh = null;
            boolean zza;
            int zzb;
            int zzc;
            java.util.ArrayList zzd;
            com.google.android.gms.auth.api.signin.GoogleSignInAccount zze;
            int zzf;
            com.google.android.gms.games.internal.zzf zzg;

            static {
                    java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                    r1 = 0
                    r0.<init>(r1)
                    com.google.android.gms.games.Games.GamesOptions.Builder.zzh = r0
                    return
            }

            private Builder() {
                    r1 = this;
                    r1.<init>()
                    r0 = 1
                    r1.zza = r0
                    r0 = 17
                    r1.zzb = r0
                    r0 = 4368(0x1110, float:6.121E-42)
                    r1.zzc = r0
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r1.zzd = r0
                    r0 = 0
                    r1.zze = r0
                    r0 = 9
                    r1.zzf = r0
                    com.google.android.gms.games.internal.zzf r0 = com.google.android.gms.games.internal.zzf.zza
                    r1.zzg = r0
                    return
            }

            /* synthetic */ Builder(com.google.android.gms.games.Games.GamesOptions r1, com.google.android.gms.games.zzm r2) {
                    r0 = this;
                    r0.<init>()
                    r2 = 1
                    r0.zza = r2
                    r2 = 17
                    r0.zzb = r2
                    r2 = 4368(0x1110, float:6.121E-42)
                    r0.zzc = r2
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    r0.zzd = r2
                    r2 = 0
                    r0.zze = r2
                    r2 = 9
                    r0.zzf = r2
                    com.google.android.gms.games.internal.zzf r2 = com.google.android.gms.games.internal.zzf.zza
                    r0.zzg = r2
                    if (r1 == 0) goto L3e
                    boolean r2 = r1.zzb
                    r0.zza = r2
                    int r2 = r1.zzc
                    r0.zzb = r2
                    int r2 = r1.zze
                    r0.zzc = r2
                    java.util.ArrayList r2 = r1.zzg
                    r0.zzd = r2
                    com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r1.zzk
                    r0.zze = r2
                    int r2 = r1.zzm
                    r0.zzf = r2
                    com.google.android.gms.games.internal.zzf r1 = r1.zzo
                    r0.zzg = r1
                L3e:
                    return
            }

            /* synthetic */ Builder(com.google.android.gms.games.zzm r1) {
                    r0 = this;
                    r0.<init>()
                    r1 = 1
                    r0.zza = r1
                    r1 = 17
                    r0.zzb = r1
                    r1 = 4368(0x1110, float:6.121E-42)
                    r0.zzc = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.zzd = r1
                    r1 = 0
                    r0.zze = r1
                    r1 = 9
                    r0.zzf = r1
                    com.google.android.gms.games.internal.zzf r1 = com.google.android.gms.games.internal.zzf.zza
                    r0.zzg = r1
                    return
            }

            @com.google.android.gms.internal.games.zzfp
            public com.google.android.gms.games.Games.GamesOptions build() {
                    r20 = this;
                    r0 = r20
                    com.google.android.gms.games.Games$GamesOptions r19 = new com.google.android.gms.games.Games$GamesOptions
                    r1 = r19
                    boolean r3 = r0.zza
                    int r4 = r0.zzb
                    int r6 = r0.zzc
                    java.util.ArrayList r8 = r0.zzd
                    com.google.android.gms.auth.api.signin.GoogleSignInAccount r12 = r0.zze
                    int r15 = r0.zzf
                    com.google.android.gms.games.internal.zzf r2 = r0.zzg
                    r17 = r2
                    r2 = 0
                    r5 = 0
                    r7 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r13 = 0
                    r14 = 0
                    r16 = 0
                    r18 = 0
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    return r19
            }

            @com.google.android.gms.internal.games.zzfp
            public com.google.android.gms.games.Games.GamesOptions.Builder setSdkVariant(int r1) {
                    r0 = this;
                    r0.zzc = r1
                    return r0
            }

            @com.google.android.gms.internal.games.zzfp
            public com.google.android.gms.games.Games.GamesOptions.Builder setShowConnectingPopup(boolean r1) {
                    r0 = this;
                    r0.zza = r1
                    r1 = 17
                    r0.zzb = r1
                    return r0
            }

            @com.google.android.gms.internal.games.zzfp
            public com.google.android.gms.games.Games.GamesOptions.Builder setShowConnectingPopup(boolean r1, int r2) {
                    r0 = this;
                    r0.zza = r1
                    r0.zzb = r2
                    return r0
            }
        }

        /* synthetic */ GamesOptions(boolean r5, boolean r6, int r7, boolean r8, int r9, java.lang.String r10, java.util.ArrayList r11, boolean r12, boolean r13, boolean r14, com.google.android.gms.auth.api.signin.GoogleSignInAccount r15, java.lang.String r16, int r17, int r18, java.lang.String r19, com.google.android.gms.games.internal.zzf r20, com.google.android.gms.games.zzn r21) {
                r4 = this;
                r0 = r4
                r4.<init>()
                r1 = 0
                r0.zza = r1
                r2 = r6
                r0.zzb = r2
                r2 = r7
                r0.zzc = r2
                r0.zzd = r1
                r2 = r9
                r0.zze = r2
                r2 = 0
                r0.zzf = r2
                r3 = r11
                r0.zzg = r3
                r0.zzh = r1
                r0.zzi = r1
                r0.zzj = r1
                r3 = r15
                r0.zzk = r3
                r0.zzl = r2
                r0.zzq = r1
                r1 = r18
                r0.zzm = r1
                r0.zzn = r2
                r1 = r20
                r0.zzo = r1
                return
        }

        @com.google.android.gms.internal.games.zzfp
        public static com.google.android.gms.games.Games.GamesOptions.Builder builder() {
                com.google.android.gms.games.Games$GamesOptions$Builder r0 = new com.google.android.gms.games.Games$GamesOptions$Builder
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.gms.games.Games.GamesOptions
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.games.Games$GamesOptions r5 = (com.google.android.gms.games.Games.GamesOptions) r5
                boolean r1 = r5.zza
                boolean r1 = r4.zzb
                boolean r3 = r5.zzb
                if (r1 != r3) goto L50
                int r1 = r4.zzc
                int r3 = r5.zzc
                if (r1 != r3) goto L50
                int r1 = r4.zze
                int r3 = r5.zze
                if (r1 != r3) goto L50
                java.util.ArrayList r1 = r4.zzg
                java.util.ArrayList r3 = r5.zzg
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L50
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r4.zzk
                if (r1 != 0) goto L33
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r5.zzk
                if (r1 != 0) goto L50
                goto L3c
            L33:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = r5.zzk
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L3c
                goto L50
            L3c:
                r1 = 0
                boolean r3 = android.text.TextUtils.equals(r1, r1)
                if (r3 == 0) goto L50
                int r3 = r4.zzm
                int r5 = r5.zzm
                if (r3 != r5) goto L50
                boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r1)
                if (r5 == 0) goto L50
                return r0
            L50:
                return r2
        }

        @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final int getExtensionType() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
        public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
                r1 = this;
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r1.zzk
                return r0
        }

        @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final java.util.List getImpliedScopes() {
                r1 = this;
                com.google.android.gms.common.api.Scope r0 = com.google.android.gms.games.Games.SCOPE_GAMES_LITE
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
        }

        public final int hashCode() {
                r2 = this;
                boolean r0 = r2.zzb
                int r0 = r0 + 16337
                int r0 = r0 * 31
                int r1 = r2.zzc
                int r0 = r0 + r1
                int r0 = r0 * 961
                int r1 = r2.zze
                int r0 = r0 + r1
                int r0 = r0 * 961
                java.util.ArrayList r1 = r2.zzg
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                r1 = 923521(0xe1781, float:1.294129E-39)
                int r0 = r0 * r1
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r2.zzk
                if (r1 != 0) goto L22
                r1 = 0
                goto L26
            L22:
                int r1 = r1.hashCode()
            L26:
                int r0 = r0 + r1
                int r0 = r0 * 29791
                int r1 = r2.zzm
                int r0 = r0 + r1
                int r0 = r0 * 31
                return r0
        }

        @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final android.os.Bundle toBundle() {
                r1 = this;
                android.os.Bundle r0 = r1.zza()
                return r0
        }

        public final android.os.Bundle zza() {
                r5 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "com.google.android.gms.games.key.isHeadless"
                r2 = 0
                r0.putBoolean(r1, r2)
                boolean r1 = r5.zzb
                java.lang.String r3 = "com.google.android.gms.games.key.showConnectingPopup"
                r0.putBoolean(r3, r1)
                int r1 = r5.zzc
                java.lang.String r3 = "com.google.android.gms.games.key.connectingPopupGravity"
                r0.putInt(r3, r1)
                java.lang.String r1 = "com.google.android.gms.games.key.retryingSignIn"
                r0.putBoolean(r1, r2)
                int r1 = r5.zze
                java.lang.String r3 = "com.google.android.gms.games.key.sdkVariant"
                r0.putInt(r3, r1)
                java.lang.String r1 = "com.google.android.gms.games.key.forceResolveAccountKey"
                r3 = 0
                r0.putString(r1, r3)
                java.util.ArrayList r1 = r5.zzg
                java.lang.String r4 = "com.google.android.gms.games.key.proxyApis"
                r0.putStringArrayList(r4, r1)
                java.lang.String r1 = "com.google.android.gms.games.key.unauthenticated"
                r0.putBoolean(r1, r2)
                java.lang.String r1 = "com.google.android.gms.games.key.skipPgaCheck"
                r0.putBoolean(r1, r2)
                java.lang.String r1 = "com.google.android.gms.games.key.skipWelcomePopup"
                r0.putBoolean(r1, r2)
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r5.zzk
                java.lang.String r2 = "com.google.android.gms.games.key.googleSignInAccount"
                r0.putParcelable(r2, r1)
                java.lang.String r1 = "com.google.android.gms.games.key.realClientPackageName"
                r0.putString(r1, r3)
                int r1 = r5.zzm
                java.lang.String r2 = "com.google.android.gms.games.key.API_VERSION"
                r0.putInt(r2, r1)
                java.lang.String r1 = "com.google.android.gms.games.key.gameRunToken"
                r0.putString(r1, r3)
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public interface GetServerAuthCodeResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.common.annotation.KeepForSdk
        java.lang.String getCode();
    }

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.games.Games.zza = r0
            com.google.android.gms.games.zzg r1 = new com.google.android.gms.games.zzg
            r1.<init>()
            com.google.android.gms.games.Games.zzd = r1
            com.google.android.gms.games.zzh r2 = new com.google.android.gms.games.zzh
            r2.<init>()
            com.google.android.gms.games.Games.zze = r2
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "xGN4Vue"
            r3.<init>(r4)
            com.google.android.gms.games.Games.SCOPE_GAMES = r3
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "xGN4Vue"
            r3.<init>(r4)
            com.google.android.gms.games.Games.SCOPE_GAMES_LITE = r3
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/drive.appdata"
            r3.<init>(r4)
            com.google.android.gms.games.Games.SCOPE_GAMES_SNAPSHOTS = r3
            com.google.android.gms.common.api.Api r3 = new com.google.android.gms.common.api.Api
            java.lang.String r4 = "Games.API"
            r3.<init>(r4, r1, r0)
            com.google.android.gms.games.Games.API = r3
            com.google.android.gms.common.api.Scope r1 = new com.google.android.gms.common.api.Scope
            java.lang.String r3 = "xGN4Vue"
            r1.<init>(r3)
            com.google.android.gms.games.Games.zzb = r1
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "Games.API_1P"
            r1.<init>(r3, r2, r0)
            com.google.android.gms.games.Games.zzc = r1
            com.google.android.gms.internal.games.zzbg r0 = new com.google.android.gms.internal.games.zzbg
            r0.<init>()
            com.google.android.gms.games.Games.GamesMetadata = r0
            com.google.android.gms.internal.games.zzac r0 = new com.google.android.gms.internal.games.zzac
            r0.<init>()
            com.google.android.gms.games.Games.Achievements = r0
            com.google.android.gms.internal.games.zzar r0 = new com.google.android.gms.internal.games.zzar
            r0.<init>()
            com.google.android.gms.games.Games.Events = r0
            com.google.android.gms.internal.games.zzcm r0 = new com.google.android.gms.internal.games.zzcm
            r0.<init>()
            com.google.android.gms.games.Games.Leaderboards = r0
            com.google.android.gms.internal.games.zzdi r0 = new com.google.android.gms.internal.games.zzdi
            r0.<init>()
            com.google.android.gms.games.Games.Players = r0
            com.google.android.gms.internal.games.zzek r0 = new com.google.android.gms.internal.games.zzek
            r0.<init>()
            com.google.android.gms.games.Games.Snapshots = r0
            com.google.android.gms.internal.games.zzep r0 = new com.google.android.gms.internal.games.zzep
            r0.<init>()
            com.google.android.gms.games.Games.Stats = r0
            com.google.android.gms.internal.games.zzfk r0 = new com.google.android.gms.internal.games.zzfk
            r0.<init>()
            com.google.android.gms.games.Games.Videos = r0
            return
    }

    private Games() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.AchievementsClient getAchievementsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzn r0 = new com.google.android.gms.internal.games.zzn
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.AchievementsClient getAchievementsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzn r0 = new com.google.android.gms.internal.games.zzn
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.AchievementsClient getAchievementsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzn r0 = new com.google.android.gms.internal.games.zzn
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.AchievementsClient getAchievementsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzn r0 = new com.google.android.gms.internal.games.zzn
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static java.lang.String getCurrentAccountName(com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = 1
            com.google.android.gms.games.internal.zzbz r1 = zzd(r1, r0)
            java.lang.String r1 = r1.zzI()
            return r1
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.EventsClient getEventsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzah r0 = new com.google.android.gms.internal.games.zzah
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.EventsClient getEventsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzah r0 = new com.google.android.gms.internal.games.zzah
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.EventsClient getEventsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzah r0 = new com.google.android.gms.internal.games.zzah
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.EventsClient getEventsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzah r0 = new com.google.android.gms.internal.games.zzah
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesClient getGamesClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzay r0 = new com.google.android.gms.internal.games.zzay
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesClient getGamesClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzay r0 = new com.google.android.gms.internal.games.zzay
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesClient getGamesClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzay r0 = new com.google.android.gms.internal.games.zzay
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesClient getGamesClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzay r0 = new com.google.android.gms.internal.games.zzay
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesMetadataClient getGamesMetadataClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbb r0 = new com.google.android.gms.internal.games.zzbb
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesMetadataClient getGamesMetadataClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbb r0 = new com.google.android.gms.internal.games.zzbb
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesMetadataClient getGamesMetadataClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbb r0 = new com.google.android.gms.internal.games.zzbb
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.GamesMetadataClient getGamesMetadataClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbb r0 = new com.google.android.gms.internal.games.zzbb
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.LeaderboardsClient getLeaderboardsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbt r0 = new com.google.android.gms.internal.games.zzbt
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.LeaderboardsClient getLeaderboardsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbt r0 = new com.google.android.gms.internal.games.zzbt
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.LeaderboardsClient getLeaderboardsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbt r0 = new com.google.android.gms.internal.games.zzbt
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.LeaderboardsClient getLeaderboardsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzbt r0 = new com.google.android.gms.internal.games.zzbt
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayerStatsClient getPlayerStatsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzco r0 = new com.google.android.gms.internal.games.zzco
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayerStatsClient getPlayerStatsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzco r0 = new com.google.android.gms.internal.games.zzco
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayerStatsClient getPlayerStatsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzco r0 = new com.google.android.gms.internal.games.zzco
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayerStatsClient getPlayerStatsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzco r0 = new com.google.android.gms.internal.games.zzco
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayersClient getPlayersClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzcy r0 = new com.google.android.gms.internal.games.zzcy
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayersClient getPlayersClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzcy r0 = new com.google.android.gms.internal.games.zzcy
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayersClient getPlayersClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzcy r0 = new com.google.android.gms.internal.games.zzcy
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.PlayersClient getPlayersClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzcy r0 = new com.google.android.gms.internal.games.zzcy
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.SnapshotsClient getSnapshotsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzds r0 = new com.google.android.gms.internal.games.zzds
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.SnapshotsClient getSnapshotsClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzds r0 = new com.google.android.gms.internal.games.zzds
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.SnapshotsClient getSnapshotsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzds r0 = new com.google.android.gms.internal.games.zzds
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    public static com.google.android.gms.games.SnapshotsClient getSnapshotsClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzds r0 = new com.google.android.gms.internal.games.zzds
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static com.google.android.gms.games.VideosClient getVideosClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzex r0 = new com.google.android.gms.internal.games.zzex
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static com.google.android.gms.games.VideosClient getVideosClient(android.app.Activity r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzex r0 = new com.google.android.gms.internal.games.zzex
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static com.google.android.gms.games.VideosClient getVideosClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzex r0 = new com.google.android.gms.internal.games.zzex
            com.google.android.gms.games.Games$GamesOptions r2 = zza(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static com.google.android.gms.games.VideosClient getVideosClient(android.content.Context r1, com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, com.google.android.gms.games.Games.GamesOptions r3) {
            java.lang.String r0 = "GoogleSignInAccount must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.internal.games.zzex r0 = new com.google.android.gms.internal.games.zzex
            com.google.android.gms.games.Games$GamesOptions r2 = zzb(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient r1) {
            com.google.android.gms.games.zzi r0 = new com.google.android.gms.games.zzi
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = r1.execute(r0)
            return r1
    }

    public static com.google.android.gms.games.Games.GamesOptions zza(com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            com.google.android.gms.games.Games$GamesOptions$Builder r0 = new com.google.android.gms.games.Games$GamesOptions$Builder
            r1 = 0
            r0.<init>(r1, r1)
            r0.zze = r2
            r2 = 1052947(0x101113, float:1.475493E-39)
            r0.setSdkVariant(r2)
            com.google.android.gms.games.Games$GamesOptions r2 = r0.build()
            return r2
    }

    public static com.google.android.gms.games.Games.GamesOptions zzb(com.google.android.gms.games.Games.GamesOptions r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3) {
            com.google.android.gms.games.Games$GamesOptions$Builder r0 = new com.google.android.gms.games.Games$GamesOptions$Builder
            r1 = 0
            r0.<init>(r2, r1)
            r0.zze = r3
            r2 = 1052947(0x101113, float:1.475493E-39)
            r0.setSdkVariant(r2)
            com.google.android.gms.games.Games$GamesOptions r2 = r0.build()
            return r2
    }

    public static com.google.android.gms.games.internal.zzbz zzc(com.google.android.gms.common.api.GoogleApiClient r3, boolean r4) {
            com.google.android.gms.common.api.Api<com.google.android.gms.games.Games$GamesOptions> r0 = com.google.android.gms.games.Games.API
            boolean r1 = r3.hasApi(r0)
            java.lang.String r2 = "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            boolean r0 = r3.hasConnectedApi(r0)
            if (r4 == 0) goto L1c
            if (r0 == 0) goto L14
            goto L20
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call."
            r3.<init>(r4)
            throw r3
        L1c:
            if (r0 != 0) goto L20
            r3 = 0
            return r3
        L20:
            com.google.android.gms.common.api.Api$ClientKey r4 = com.google.android.gms.games.Games.zza
            com.google.android.gms.common.api.Api$Client r3 = r3.getClient(r4)
            com.google.android.gms.games.internal.zzbz r3 = (com.google.android.gms.games.internal.zzbz) r3
            return r3
    }

    public static com.google.android.gms.games.internal.zzbz zzd(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "GoogleApiClient parameter is required."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            boolean r0 = r2.isConnected()
            java.lang.String r1 = "GoogleApiClient must be connected."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.games.internal.zzbz r2 = zzc(r2, r3)
            return r2
    }
}
