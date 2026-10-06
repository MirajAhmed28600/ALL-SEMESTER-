#include <iostream>
using namespace std;

const int MAX_SEMESTERS = 5;
const int MAX_STUDENTS = 5;

struct Result
{
    string semester_name;
    int credits;
    double gpa;
};

struct Student
{
    string first_name;
    string last_name;
    string id;
    string department;
    Result results[MAX_SEMESTERS];
    int num_semesters;
    double total_credits;
    double cgpa;
};

void input(Student students[], int n)
{
    for(int i = 0;i<n;i++)
    {
        cout<<"--- Enter details for Student "<<i+1<<" ---"<<endl;
        cout<<"Enter first name: ";
        cin>>students[i].first_name;
        cout<<"Enter last name: ";
        cin>>students[i].last_name;
        cout<<"Enter ID: ";
        cin>>students[i].id;
        cout<<"Enter department: ";
        cin>>students[i].department;

        cout<<"Enter number of semesters (max "<<MAX_SEMESTERS<<"): ";
        cin>>students[i].num_semesters;

        for(int j = 0;j<students[i].num_semesters;j++)
        {
            cout<<"  Semester "<<j+1<<" name: ";
            cin>>students[i].results[j].semester_name;
            cout<<"  Credits taken: ";
            cin>>students[i].results[j].credits;
            cout<<"  GPA earned: ";
            cin>>students[i].results[j].gpa;
        }
    }
}

void calculateCGPA(Student students[], int n)
{
    for(int i = 0;i<n;i++)
    {
        double totalCredits = 0;
        double totalPoints = 0;

        for(int j = 0;j<students[i].num_semesters;j++)
        {
            totalCredits += students[i].results[j].credits;
            totalPoints += students[i].results[j].credits * students[i].results[j].gpa;
        }

        students[i].total_credits = totalCredits;

        if(totalCredits>0)
        {
            students[i].cgpa = totalPoints/totalCredits;
        }
        else
        {
            students[i].cgpa = 0;
        }
    }
}

void display(Student students[], int n)
{
    cout<<endl<<"ID\tName\t\tDepartment\tTotal Credits\tCGPA"<<endl;

    for(int i = 0;i<n;i++)
    {
        cout<<students[i].id<<"\t"<<students[i].first_name<<" "<<students[i].last_name<<"\t"<<students[i].department<<"\t"<<students[i].total_credits<<"\t\t"<<students[i].cgpa<<endl;
    }
}

void highestCGPA(Student students[], int n)
{
    int index = 0;

    for(int i = 1;i<n;i++)
    {
        if(students[i].cgpa>students[index].cgpa)
        {
            index = i;
        }
    }

    cout<<endl<<"Student with the highest CGPA: "<<students[index].first_name<<" "<<students[index].last_name<<" (CGPA: "<<students[index].cgpa<<")"<<endl;
}

int main()
{
    Student students[MAX_STUDENTS];

    input(students, MAX_STUDENTS);
    calculateCGPA(students, MAX_STUDENTS);
    display(students, MAX_STUDENTS);
    highestCGPA(students, MAX_STUDENTS);

    return 0;
}