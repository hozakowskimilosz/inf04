class Music:
    def __init__(self, artist, album, songsNumber, year, downloadNumber):
        self.artist = artist
        self.album = album
        self.songsNumber = songsNumber
        self.year = year
        self.downloadNumber = downloadNumber

    @staticmethod
    def readFile():
        albums = []
        with open("Data.txt", 'r') as file:
            lines = [line.strip() for line in file if line.strip()]  # Ignoruje puste linie
            for i in range(0, len(lines), 5):
                artist = lines[i]
                album = lines[i + 1]
                songsNumber = lines[i + 2]
                year = lines[i + 3]
                downloadNumber = lines[i + 4]
                albums.append(Music(artist, album, songsNumber, year, downloadNumber))
        return albums

collection = Music.readFile()
for album in collection:
    print(album.artist)
    print(f'"{album.album}"')
    print(album.songsNumber)
    print(album.year)
    print(album.downloadNumber)
    print("\n")
