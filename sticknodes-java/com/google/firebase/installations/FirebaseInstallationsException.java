package com.google.firebase.installations;

/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends com.google.firebase.FirebaseException {
    private final com.google.firebase.installations.FirebaseInstallationsException.Status status;

    public enum Status extends java.lang.Enum<com.google.firebase.installations.FirebaseInstallationsException.Status> {
        private static final /* synthetic */ com.google.firebase.installations.FirebaseInstallationsException.Status[] $VALUES = null;
        public static final com.google.firebase.installations.FirebaseInstallationsException.Status BAD_CONFIG = null;
        public static final com.google.firebase.installations.FirebaseInstallationsException.Status TOO_MANY_REQUESTS = null;
        public static final com.google.firebase.installations.FirebaseInstallationsException.Status UNAVAILABLE = null;

        private static /* synthetic */ com.google.firebase.installations.FirebaseInstallationsException.Status[] $values() {
                r0 = 3
                com.google.firebase.installations.FirebaseInstallationsException$Status[] r0 = new com.google.firebase.installations.FirebaseInstallationsException.Status[r0]
                com.google.firebase.installations.FirebaseInstallationsException$Status r1 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
                r2 = 0
                r0[r2] = r1
                com.google.firebase.installations.FirebaseInstallationsException$Status r1 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
                r2 = 1
                r0[r2] = r1
                com.google.firebase.installations.FirebaseInstallationsException$Status r1 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.google.firebase.installations.FirebaseInstallationsException$Status r0 = new com.google.firebase.installations.FirebaseInstallationsException$Status
                java.lang.String r1 = "BAD_CONFIG"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG = r0
                com.google.firebase.installations.FirebaseInstallationsException$Status r0 = new com.google.firebase.installations.FirebaseInstallationsException$Status
                java.lang.String r1 = "UNAVAILABLE"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE = r0
                com.google.firebase.installations.FirebaseInstallationsException$Status r0 = new com.google.firebase.installations.FirebaseInstallationsException$Status
                java.lang.String r1 = "TOO_MANY_REQUESTS"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS = r0
                com.google.firebase.installations.FirebaseInstallationsException$Status[] r0 = $values()
                com.google.firebase.installations.FirebaseInstallationsException.Status.$VALUES = r0
                return
        }

        Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.firebase.installations.FirebaseInstallationsException.Status valueOf(java.lang.String r1) {
                java.lang.Class<com.google.firebase.installations.FirebaseInstallationsException$Status> r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.firebase.installations.FirebaseInstallationsException$Status r1 = (com.google.firebase.installations.FirebaseInstallationsException.Status) r1
                return r1
        }

        public static com.google.firebase.installations.FirebaseInstallationsException.Status[] values() {
                com.google.firebase.installations.FirebaseInstallationsException$Status[] r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.firebase.installations.FirebaseInstallationsException$Status[] r0 = (com.google.firebase.installations.FirebaseInstallationsException.Status[]) r0
                return r0
        }
    }

    public FirebaseInstallationsException(com.google.firebase.installations.FirebaseInstallationsException.Status r1) {
            r0 = this;
            r0.<init>()
            r0.status = r1
            return
    }

    public FirebaseInstallationsException(java.lang.String r1, com.google.firebase.installations.FirebaseInstallationsException.Status r2) {
            r0 = this;
            r0.<init>(r1)
            r0.status = r2
            return
    }
}
