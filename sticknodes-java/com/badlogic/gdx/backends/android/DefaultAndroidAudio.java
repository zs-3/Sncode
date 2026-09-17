package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class DefaultAndroidAudio implements com.badlogic.gdx.backends.android.AndroidAudio {
    private final android.media.AudioManager manager;
    private final java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> musics;
    private final android.media.SoundPool soundPool;

    public DefaultAndroidAudio(android.content.Context r3, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.musics = r0
            boolean r0 = r4.disableAudio
            if (r0 != 0) goto L4c
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            r1 = 14
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
            r1 = 4
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
            android.media.AudioAttributes r0 = r0.build()
            android.media.SoundPool$Builder r1 = new android.media.SoundPool$Builder
            r1.<init>()
            android.media.SoundPool$Builder r0 = r1.setAudioAttributes(r0)
            int r4 = r4.maxSimultaneousSounds
            android.media.SoundPool$Builder r4 = r0.setMaxStreams(r4)
            android.media.SoundPool r4 = r4.build()
            r2.soundPool = r4
            java.lang.String r4 = "audio"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            r2.manager = r4
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 == 0) goto L51
            android.app.Activity r3 = (android.app.Activity) r3
            r4 = 3
            r3.setVolumeControlStream(r4)
            goto L51
        L4c:
            r3 = 0
            r2.soundPool = r3
            r2.manager = r3
        L51:
            return
    }

    protected android.media.MediaPlayer createMediaPlayer() {
            r3 = this;
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 > r2) goto L10
            r1 = 3
            r0.setAudioStreamType(r1)
            goto L27
        L10:
            android.media.AudioAttributes$Builder r1 = new android.media.AudioAttributes$Builder
            r1.<init>()
            r2 = 2
            android.media.AudioAttributes$Builder r1 = r1.setContentType(r2)
            r2 = 14
            android.media.AudioAttributes$Builder r1 = r1.setUsage(r2)
            android.media.AudioAttributes r1 = r1.build()
            r0.setAudioAttributes(r1)
        L27:
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            android.media.SoundPool r0 = r3.soundPool
            if (r0 != 0) goto L5
            return
        L5:
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r0 = r3.musics
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r2 = r3.musics     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            com.badlogic.gdx.backends.android.AndroidMusic r2 = (com.badlogic.gdx.backends.android.AndroidMusic) r2     // Catch: java.lang.Throwable -> L2a
            r2.dispose()     // Catch: java.lang.Throwable -> L2a
            goto L13
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            android.media.SoundPool r0 = r3.soundPool
            r0.release()
            return
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public java.lang.String[] getAvailableOutputDevices() {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public com.badlogic.gdx.audio.AudioDevice newAudioDevice(int r2, boolean r3) {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            if (r0 == 0) goto La
            com.badlogic.gdx.backends.android.AndroidAudioDevice r0 = new com.badlogic.gdx.backends.android.AndroidAudioDevice
            r0.<init>(r2, r3)
            return r0
        La:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r3 = "Android audio is not enabled by the application config."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public com.badlogic.gdx.audio.AudioRecorder newAudioRecorder(int r2, boolean r3) {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            if (r0 == 0) goto La
            com.badlogic.gdx.backends.android.AndroidAudioRecorder r0 = new com.badlogic.gdx.backends.android.AndroidAudioRecorder
            r0.<init>(r2, r3)
            return r0
        La:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r3 = "Android audio is not enabled by the application config."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio, com.badlogic.gdx.Audio
    public com.badlogic.gdx.audio.Music newMusic(com.badlogic.gdx.files.FileHandle r9) {
            r8 = this;
            android.media.SoundPool r0 = r8.soundPool
            if (r0 == 0) goto L94
            r0 = r9
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = (com.badlogic.gdx.backends.android.AndroidFileHandle) r0
            android.media.MediaPlayer r7 = r8.createMediaPlayer()
            com.badlogic.gdx.Files$FileType r1 = r0.type()
            com.badlogic.gdx.Files$FileType r2 = com.badlogic.gdx.Files.FileType.Internal
            if (r1 != r2) goto L5c
            android.content.res.AssetFileDescriptor r0 = r0.getAssetFileDescriptor()     // Catch: java.lang.Exception -> L3f
            java.io.FileDescriptor r2 = r0.getFileDescriptor()     // Catch: java.lang.Exception -> L3f
            long r3 = r0.getStartOffset()     // Catch: java.lang.Exception -> L3f
            long r5 = r0.getLength()     // Catch: java.lang.Exception -> L3f
            r1 = r7
            r1.setDataSource(r2, r3, r5)     // Catch: java.lang.Exception -> L3f
            r0.close()     // Catch: java.lang.Exception -> L3f
            r7.prepare()     // Catch: java.lang.Exception -> L3f
            com.badlogic.gdx.backends.android.AndroidMusic r0 = new com.badlogic.gdx.backends.android.AndroidMusic     // Catch: java.lang.Exception -> L3f
            r0.<init>(r8, r7)     // Catch: java.lang.Exception -> L3f
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r1 = r8.musics     // Catch: java.lang.Exception -> L3f
            monitor-enter(r1)     // Catch: java.lang.Exception -> L3f
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r2 = r8.musics     // Catch: java.lang.Throwable -> L3c
            r2.add(r0)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            return r0
        L3c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Exception -> L3f
        L3f:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error loading audio file: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = "\nNote: Internal audio files must be placed in the assets directory."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.<init>(r9, r0)
            throw r1
        L5c:
            java.io.File r0 = r0.file()     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L7c
            r7.setDataSource(r0)     // Catch: java.lang.Exception -> L7c
            r7.prepare()     // Catch: java.lang.Exception -> L7c
            com.badlogic.gdx.backends.android.AndroidMusic r0 = new com.badlogic.gdx.backends.android.AndroidMusic     // Catch: java.lang.Exception -> L7c
            r0.<init>(r8, r7)     // Catch: java.lang.Exception -> L7c
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r1 = r8.musics     // Catch: java.lang.Exception -> L7c
            monitor-enter(r1)     // Catch: java.lang.Exception -> L7c
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r2 = r8.musics     // Catch: java.lang.Throwable -> L79
            r2.add(r0)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            return r0
        L79:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Exception -> L7c
        L7c:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error loading audio file: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.<init>(r9, r0)
            throw r1
        L94:
            com.badlogic.gdx.utils.GdxRuntimeException r9 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Android audio is not enabled by the application config."
            r9.<init>(r0)
            throw r9
    }

    public com.badlogic.gdx.audio.Music newMusic(java.io.FileDescriptor r3) {
            r2 = this;
            android.media.SoundPool r0 = r2.soundPool
            if (r0 == 0) goto L29
            android.media.MediaPlayer r0 = r2.createMediaPlayer()
            r0.setDataSource(r3)     // Catch: java.lang.Exception -> L20
            r0.prepare()     // Catch: java.lang.Exception -> L20
            com.badlogic.gdx.backends.android.AndroidMusic r3 = new com.badlogic.gdx.backends.android.AndroidMusic     // Catch: java.lang.Exception -> L20
            r3.<init>(r2, r0)     // Catch: java.lang.Exception -> L20
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r0 = r2.musics     // Catch: java.lang.Exception -> L20
            monitor-enter(r0)     // Catch: java.lang.Exception -> L20
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r1 = r2.musics     // Catch: java.lang.Throwable -> L1d
            r1.add(r3)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r3
        L1d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Error loading audio from FileDescriptor"
            r0.<init>(r1, r3)
            throw r0
        L29:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Android audio is not enabled by the application config."
            r3.<init>(r0)
            throw r3
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio, com.badlogic.gdx.Audio
    public com.badlogic.gdx.audio.Sound newSound(com.badlogic.gdx.files.FileHandle r7) {
            r6 = this;
            android.media.SoundPool r0 = r6.soundPool
            if (r0 == 0) goto L6e
            r0 = r7
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = (com.badlogic.gdx.backends.android.AndroidFileHandle) r0
            com.badlogic.gdx.Files$FileType r1 = r0.type()
            com.badlogic.gdx.Files$FileType r2 = com.badlogic.gdx.Files.FileType.Internal
            r3 = 1
            java.lang.String r4 = "Error loading audio file: "
            if (r1 != r2) goto L42
            android.content.res.AssetFileDescriptor r0 = r0.getAssetFileDescriptor()     // Catch: java.io.IOException -> L27
            com.badlogic.gdx.backends.android.AndroidSound r1 = new com.badlogic.gdx.backends.android.AndroidSound     // Catch: java.io.IOException -> L27
            android.media.SoundPool r2 = r6.soundPool     // Catch: java.io.IOException -> L27
            android.media.AudioManager r5 = r6.manager     // Catch: java.io.IOException -> L27
            int r3 = r2.load(r0, r3)     // Catch: java.io.IOException -> L27
            r1.<init>(r2, r5, r3)     // Catch: java.io.IOException -> L27
            r0.close()     // Catch: java.io.IOException -> L27
            goto L57
        L27:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r7)
            java.lang.String r7 = "\nNote: Internal audio files must be placed in the assets directory."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7, r0)
            throw r1
        L42:
            com.badlogic.gdx.backends.android.AndroidSound r1 = new com.badlogic.gdx.backends.android.AndroidSound     // Catch: java.lang.Exception -> L58
            android.media.SoundPool r2 = r6.soundPool     // Catch: java.lang.Exception -> L58
            android.media.AudioManager r5 = r6.manager     // Catch: java.lang.Exception -> L58
            java.io.File r0 = r0.file()     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L58
            int r0 = r2.load(r0, r3)     // Catch: java.lang.Exception -> L58
            r1.<init>(r2, r5, r0)     // Catch: java.lang.Exception -> L58
        L57:
            return r1
        L58:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7, r0)
            throw r1
        L6e:
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Android audio is not enabled by the application config."
            r7.<init>(r0)
            throw r7
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void notifyMusicDisposed(com.badlogic.gdx.backends.android.AndroidMusic r2) {
            r1 = this;
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r2 = r1.musics
            monitor-enter(r2)
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r0 = r1.musics     // Catch: java.lang.Throwable -> La
            r0.remove(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void pause() {
            r4 = this;
            android.media.SoundPool r0 = r4.soundPool
            if (r0 != 0) goto L5
            return
        L5:
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r0 = r4.musics
            monitor-enter(r0)
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r1 = r4.musics     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L32
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L32
            com.badlogic.gdx.backends.android.AndroidMusic r2 = (com.badlogic.gdx.backends.android.AndroidMusic) r2     // Catch: java.lang.Throwable -> L32
            boolean r3 = r2.isPlaying()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L27
            r2.pause()     // Catch: java.lang.Throwable -> L32
            r3 = 1
            r2.wasPlaying = r3     // Catch: java.lang.Throwable -> L32
            goto Le
        L27:
            r3 = 0
            r2.wasPlaying = r3     // Catch: java.lang.Throwable -> L32
            goto Le
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            android.media.SoundPool r0 = r4.soundPool
            r0.autoPause()
            return
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void resume() {
            r3 = this;
            android.media.SoundPool r0 = r3.soundPool
            if (r0 != 0) goto L5
            return
        L5:
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r0 = r3.musics
            monitor-enter(r0)
            r1 = 0
        L9:
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r2 = r3.musics     // Catch: java.lang.Throwable -> L32
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L32
            if (r1 >= r2) goto L2b
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r2 = r3.musics     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L32
            com.badlogic.gdx.backends.android.AndroidMusic r2 = (com.badlogic.gdx.backends.android.AndroidMusic) r2     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.wasPlaying     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L28
            java.util.List<com.badlogic.gdx.backends.android.AndroidMusic> r2 = r3.musics     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L32
            com.badlogic.gdx.backends.android.AndroidMusic r2 = (com.badlogic.gdx.backends.android.AndroidMusic) r2     // Catch: java.lang.Throwable -> L32
            r2.play()     // Catch: java.lang.Throwable -> L32
        L28:
            int r1 = r1 + 1
            goto L9
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            android.media.SoundPool r0 = r3.soundPool
            r0.autoResume()
            return
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public boolean switchOutputDevice(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
