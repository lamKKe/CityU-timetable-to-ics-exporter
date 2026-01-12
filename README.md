# CityU Timetable Exporter

> Exports course details from AIMS to a `.ics` file, ready for import into your mobile calendar.

## How to get the source data

1. Log in to **AIMS**.
2. Navigate to: `Course Registration` > `Weekly Schedule` > `Student Detail Schedule`.
3. Copy the entire page content (<kbd>Ctrl</kbd>+<kbd>A</kbd>, <kbd>Ctrl</kbd>+<kbd>C</kbd>) into a local text file (e.g., `schedule.txt`).

## Usage

Execute the following command in your terminal:

```bash
java Main.java <filename>
```
Once exported, double-click the `.ics` file to import it into your calendar.

> **Note for Apple users:** When importing, choosing "New Calendar" will automatically name the calendar using the output filename.
### Options

| Option | Description |
| --- | --- |
| `-h`, `--help` | Show help message |
| `-o`, `--output <file>` | Specify output ICS file name |
| `-s`, `--setfile <file>` | Set the input file name |
| `-d`, `--toDifferentFile` | Export each course to a different ICS file |