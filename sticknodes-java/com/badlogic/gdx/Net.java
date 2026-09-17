package com.badlogic.gdx;

/* loaded from: classes.dex */
public interface Net {

    public static class HttpRequest implements com.badlogic.gdx.utils.Pool.Poolable {
    }

    public interface HttpResponseListener {
        void cancelled();
    }

    public enum Protocol extends java.lang.Enum<com.badlogic.gdx.Net.Protocol> {
        private static final /* synthetic */ com.badlogic.gdx.Net.Protocol[] $VALUES = null;
        public static final com.badlogic.gdx.Net.Protocol TCP = null;

        static {
                com.badlogic.gdx.Net$Protocol r0 = new com.badlogic.gdx.Net$Protocol
                java.lang.String r1 = "TCP"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Net.Protocol.TCP = r0
                r1 = 1
                com.badlogic.gdx.Net$Protocol[] r1 = new com.badlogic.gdx.Net.Protocol[r1]
                r1[r2] = r0
                com.badlogic.gdx.Net.Protocol.$VALUES = r1
                return
        }

        Protocol(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Net.Protocol valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Net$Protocol> r0 = com.badlogic.gdx.Net.Protocol.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Net$Protocol r1 = (com.badlogic.gdx.Net.Protocol) r1
                return r1
        }

        public static com.badlogic.gdx.Net.Protocol[] values() {
                com.badlogic.gdx.Net$Protocol[] r0 = com.badlogic.gdx.Net.Protocol.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Net$Protocol[] r0 = (com.badlogic.gdx.Net.Protocol[]) r0
                return r0
        }
    }

    boolean openURI(java.lang.String r1);
}
